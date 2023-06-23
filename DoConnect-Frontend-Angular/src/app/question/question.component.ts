import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { AnswerType, BASE_URL, QuestionType } from '../constants/constants';
import { UploadImageService } from '../service/upload-image.service';
import { UserService } from '../service/user.service';
import { handleErrorResponse, getCurrentId } from '../utils/util';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css'],
})
export class QuestionComponent implements OnInit {
  public answerForm !: FormGroup;
  questionData: QuestionType | undefined = undefined;
  answersList: AnswerType[] = [];
  questionId: number | undefined;
  uploadedImage: string = "";

  isloading = false;


  constructor(private _userService: UserService, private activatedRoute: ActivatedRoute, private router: Router, private _uploadService: UploadImageService) {}

  ngOnInit(): void {
    this.answerForm = new FormGroup({
      answer: new FormControl('', [Validators.required]),
      image: new FormControl('')
    })
    this.getData();

  }

  getData() {
    const urlParams = this.activatedRoute.snapshot.params;
    this.questionId = urlParams['id'];
    // if (this.questionId) {
    //   this._userService.getQuestion(this.questionId).subscribe({
    //     next: (result) => (this.questionData = result as QuestionType),
    //     error: (error) => handleErrorResponse(error, this.router),
    //   });
    //   this._userService.getAnswers(this.questionId).subscribe({
    //     next: (result) => (this.answersList = result as AnswerType[]),
    //     error: (error) => handleErrorResponse(error, this.router),
    //   });
    // }

    this._userService.getQuestionById(this.questionId as number).subscribe({
      next: (result) => (this.questionData = result as QuestionType),
      error: (err) => handleErrorResponse(err, this.router),
    });
    this._userService.getAnswers(this.questionId as number).subscribe({
      next: (result) => (this.answersList = result as AnswerType[]),
      error: (error) => handleErrorResponse(error, this.router),
    });
    console.log(this.answersList);
  }

  onChange(event: any) {
    // const imageFile = event.target.files[0];
    // if (imageFile) {
    //   this._uploadService.uploadImage(imageFile).subscribe({
    //     next: (result) => {
    //       this.uploadedImages = result;
    //     },
    //     error: (error: HttpErrorResponse) => handleErrorResponse(error, this.router),
    //   });
    // }
  }

  getImageUrl(imageName: string) {
    return `${BASE_URL}/images/${imageName}`;
  }

  submit() {
    this.isloading = true;

    console.log({
      description_answer: this.answerForm.value.answer,
      img_src: this.answerForm.value.image,
      acreated_by : {id : getCurrentId()},
      aapproved_by: {id : getCurrentId()},
      datetime: (Date.now() as any as string),
      status: "false",
      question : {id : this.questionId},
      question_by : {id : this.questionId},
    });
    if (this.questionId) {
      this._userService
      .postAnswer({
        description_answer: this.answerForm.value.answer,
        img_src: this.answerForm.value.image,
        acreated_by : {id : getCurrentId()},
        aapproved_by: {id : getCurrentId()},
        datetime: (Date.now() as any as string),
        status: "false",
        question_by : {id : this.questionId},
        question : {id : this.questionId},

      })
      .subscribe({
        next: (result) => {
          this.isloading = false;
          alert('Your answer submission was successful.');
          this.router.navigate(['/']);
        },
        error: (error) => {
          this.isloading = false;
          handleErrorResponse(error, this.router);
        }
      });
    }
  }
}
