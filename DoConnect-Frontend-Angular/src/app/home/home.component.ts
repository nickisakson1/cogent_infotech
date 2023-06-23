import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit, ChangeDetectorRef  } from '@angular/core';
import { Router } from '@angular/router';
import { QUESTIONS_TOPICS, QuestionType } from '../constants/constants';
import { UserService } from '../service/user.service';
import { AdminService } from '../service/admin.service';
import { handleErrorResponse, isUserAdmin, getUserType, isUserLoggedIn } from '../utils/util';
import { User } from '../constants/constants';
import { HostListener  } from "@angular/core";


const OPEN_CHAT_BUTTON_LABEL = 'Chat';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})

export class HomeComponent implements OnInit {
  
  userList: User[] = [];
  mode:string="";
  questionList: QuestionType[] = [];

  search: string = '';
  topic: string = 'All';

  topicOptions: string[] = [ 'All', ...QUESTIONS_TOPICS ];
  chatbox = 'none';
  userType = getUserType();
  isAdmin: boolean = isUserAdmin();
  isUserLoggedIn: boolean = isUserLoggedIn();
  chatButton: string = OPEN_CHAT_BUTTON_LABEL;

  constructor(private _userService: UserService,
    private router: Router, private _adminService: AdminService, private changeDetection: ChangeDetectorRef
    ) {}

  ngOnInit(): void {
    if (getUserType() == "admin"){
      this.router.navigate([`/dashboard`]);
    }
    this.mode="questions";
    if(isUserLoggedIn()){
      this._userService.getApprovedQuestions().subscribe({
        next: (result) => (this.questionList = result as QuestionType[]),
        error: (error: HttpErrorResponse) => handleErrorResponse(error, this.router)
      });
    }
  }
  
  getApprovedQuestions() {
    this.mode = 'questions';
    this._userService.getApprovedQuestions().subscribe({
      next: (result) => (this.questionList = result as QuestionType[]),
      error: (err) => handleErrorResponse(err, this.router),
    });
  }

  getUsers() {
    this.mode = 'users';
    this._adminService.getUsers().subscribe({
      next: (result) => (this.userList = result as User[]),
      error: (err) => handleErrorResponse(err, this.router),
    });
  }

  getUsersChat() {
    this.mode = 'chats';
    this._adminService.getUsers().subscribe({
      next: (result) => (this.userList = result as User[]),
      error: (err) => handleErrorResponse(err, this.router),
    });
  }


  toggleChatBox() {
    this.chatbox = this.chatbox === 'block' ? 'none' : 'block';
  }

  openQuestion(id: number) {
    this.router.navigate([`/question/${id}`]);
  }
  onChat(touser: string) {

    localStorage.setItem("touser", touser);
  }
  onTopicSelected(value:any){
    this.topic = value as string;
    console.log(this.topic);
    console.log(this.search);
  }

  onSearch(){

    if(isUserLoggedIn()){
      this._userService.getApprovedQuestions().subscribe({
        next: (result) => {
          this.questionList = result as QuestionType[];
          if (this.topic == "All"){

          } else {
            for(let i = 0; i<this.questionList.length; i++){
              if (this.topic != this.questionList[i].topic){
                this.questionList.splice(i,1);
                i = i-1;
              }
            }
          }
          if ( this.search == ''){

          } else {
            const regex = this.search.toLowerCase() ;
            for(let i = 0; i<this.questionList.length; i++){
              if (!(((this.questionList[i].description_question.toLowerCase()).match(regex)) 
                || ((this.questionList[i].title.toLowerCase()).match(regex))
                || ((this.questionList[i].topic.toLowerCase()).match(regex))))
                {
                this.questionList.splice(i,1);
                i = i-1;
              }
            }
          }

          this.changeDetection.detectChanges();
        },
        error: (error: HttpErrorResponse) => handleErrorResponse(error, this.router)
      });
    }

    // setTimeout(() => {
    // }, 500);

  }


  // public trackItem (index: number, item:QuestionType) {
  //   return item.id;;
  // }
  // searchHelper(query: string, topic: string) {
  //   this._userService.searchQuestion(query, (topic === 'All') ? '' : topic).subscribe({
  //     next: (result) => (this.questionList = result as QuestionType[]),
  //     error: (error: HttpErrorResponse) => handleErrorResponse(error, this.router),
  //   });
  // }

  // onSearch() {
  //   this.searchHelper(this.search, (this.topic === 'All') ? '' : this.topic);
  // }

  // onTopicSelected(value: string) {
  //   this.topic = value;
  //   this.search = '';
  //   this.searchHelper(this.search, (this.topic === 'All') ? '' : this.topic);
  // }
}
