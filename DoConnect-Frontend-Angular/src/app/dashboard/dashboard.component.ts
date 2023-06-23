import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AnswerType, QuestionType, User, UserType } from '../constants/constants';
import { AdminService } from '../service/admin.service';
import { handleErrorResponse, isUserAdmin, getUserType, isUserLoggedIn, getCurrentUsername  } from '../utils/util';
import {DragDropModule} from '@angular/cdk/drag-drop';
import {MatGridListModule} from '@angular/material/grid-list';

const OPEN_CHAT_BUTTON_LABEL = 'Chat';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
})

export class DashboardComponent implements OnInit {

  mode = 'questions';
  questionList: QuestionType[] = [];
  answerList: AnswerType[] = [];
  userList: User[] = [];

  // chatbox = 'none';
  chatbox = 'none';
  userType = getUserType();
  isAdmin: boolean = isUserAdmin();
  isUserLoggedIn: boolean = isUserLoggedIn();
  chatButton: string = OPEN_CHAT_BUTTON_LABEL;

  isloading = false;

  constructor(private _adminService: AdminService, private router: Router) {}

  ngOnInit(): void {
    this.getUnapprovedQuestions();
    console.log(this.getUnapprovedQuestions());
  }

  getUnapprovedQuestions() {
    this.mode = 'questions';
    this._adminService.getUnapprovedQuestions().subscribe({
      next: (result) => (this.questionList = result as QuestionType[]),
      error: (err) => handleErrorResponse(err, this.router),
    });
    console.log("Getting Unapproved Questions");
    console.log(this.questionList);
  }

  getUnapprovedAnswers() {
    this.mode = 'answers';
    this._adminService.getUnapprovedAnswers().subscribe({
      next: (result:any) => (
        // console.log(result)
        this.answerList = result as AnswerType[]
        ),
      error: (err) => handleErrorResponse(err, this.router),
    });
    console.log("Getting Unapproved Answers");
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

  onDelete(id: number) {
    this.isloading = true;

    // if (confirm('Are you sure you want to remove this user? This action cannot be reverted.')) {
      this._adminService.deleteUser(id).subscribe({
        next: (res) => {
          this.isloading = false;
          this.getUsers();
        },
        error: (err) => {
          this.isloading = false;
          handleErrorResponse(err, this.router);
        },
      });
    // }
  }

  onChat(touser: string) {
    // if (confirm('Are you sure you want to remove this user? This action cannot be reverted.')) {
    //   this._adminService.deleteUser(id).subscribe({
    //     next: (res) => {
    //       this.getUsers()
    //     },
    //     error: (err) => handleErrorResponse(err, this.router),
    //   });
    // }
    localStorage.setItem("touser", touser);
  }
  onApproveQuestion(id: number) {
    this.isloading = true;
    this._adminService.approveQuestion(id).subscribe({
      next: (res) => {
        this.isloading = false;
        this.getUnapprovedQuestions();
      },
      error: (err) => {
        this.isloading = false;
        handleErrorResponse(err, this.router);
      },
    });
  }

  onDeleteQuestion(id: number) {
    this.isloading = true;
    // if (confirm('Are you sure? This action cannot be reverted.')) {
      this._adminService.deleteQuestion(id).subscribe({
        next: (res) => {
          this.isloading = false;
          this.getUnapprovedQuestions();},
        error: (err) => {
          this.isloading = false;
          handleErrorResponse(err, this.router);},
      });
    // }
  }

  onApproveAnswer(id:number) {
    this.isloading = true;
    this._adminService.approveAnswer(id).subscribe({
      next: (res) => {
        this.isloading = false;
        this.getUnapprovedAnswers();
      },
      error: (err) => {
        this.isloading = false;
        handleErrorResponse(err, this.router);
      },
    });
  }

  onDeleteAnswer(id:number) {
    this.isloading = true;
    // if (confirm('Are you sure? This action cannot be reverted.')) {
      this._adminService.deleteAnswer(id).subscribe({
        next: (res) => {
          this.isloading = false;
          this.getUnapprovedAnswers();
        }
          ,
        error: (err) => {
          this.isloading = false;
          handleErrorResponse(err, this.router);
        },
      });
    // }
  }
  toggleChatBox() {
    this.chatbox = this.chatbox === 'block' ? 'none' : 'block';
  }
}
