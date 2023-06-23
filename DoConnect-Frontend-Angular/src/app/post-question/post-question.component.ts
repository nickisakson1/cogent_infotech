import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators,FormBuilder  } from '@angular/forms';
import { Router } from '@angular/router';
import { BASE_URL, QUESTIONS_TOPICS, User } from '../constants/constants';
import { UploadImageService } from '../service/upload-image.service';
import { UserService } from '../service/user.service';
import { getCurrentUsername, handleErrorResponse, getCurrentId } from '../utils/util';

@Component({
  selector: 'app-post-question',
  templateUrl: './post-question.component.html',
  styleUrls: ['./post-question.component.css'],
})

export class PostQuestionComponent implements OnInit {
  public questionForm:FormGroup;
  topicOptions: string[] = QUESTIONS_TOPICS;
  uploadedImages: string = "";
  path:string ="";

  isloading = false;

  constructor(private _uploadService: UploadImageService, private _userService: UserService, private router: Router) {
    this.questionForm = new FormGroup({
      title: new FormControl(),
      topic: new FormControl(),
      question: new FormControl(),
      image: new FormControl()
    })
  }

  ngOnInit(): void {
    this.questionForm = new FormGroup({
      title: new FormControl(''),
      question: new FormControl('', [Validators.required]),
      topic: new FormControl(QUESTIONS_TOPICS[0], [Validators.required]),
      image: new FormControl('')
    });
  }

  // onChange(event: any) {
  //   const imageFile = event.target.files[0];
  //   if (imageFile) {
  //     this._uploadService.uploadImage(imageFile).subscribe({
  //       next: (result) => {
  //         this.uploadedImages = result;
  //       },
  //       error: (error: HttpErrorResponse) => handleErrorResponse(error, this.router),
  //     });
  //   }
  // }

  // getImageUrl(imageName: string) {
  //   return `${BASE_URL}/images/${imageName}`;
  // }

  submit(): void {
    this.isloading = true;
    console.log(Date.now());
    this._userService
      .postQuestion({
        description_question:this.questionForm.value.question,
        status: "false",
        datetime: (Date.now() as any as string),
        topic: this.questionForm.value.topic,
        // title: this.questionForm.value.title,
        title: this.questionForm.value.title,
        image_src: this.questionForm.value.image,
        qcreated_by: {id : getCurrentId()},
        qapproved_by: {id : getCurrentId()},
      })
      .subscribe({
        next: (result) => {
          this.isloading = false;
          alert('Your question submission was successful.');
          this.router.navigate(['/']);
        },
        error: (error) => {
          this.isloading = false;
          handleErrorResponse(error, this.router);}
      });

  }
}
