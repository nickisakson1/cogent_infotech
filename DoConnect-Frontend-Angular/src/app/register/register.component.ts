import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../service/user.service';
import { FormGroup, FormControl, Validators } from "@angular/forms";
import { HttpErrorResponse } from '@angular/common/http';
import { handleErrorResponse } from '../utils/util';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})

export class RegisterComponent implements OnInit {
  public registerForm !: FormGroup;

  usernameExists:boolean = false;
  alreadyExistingUsername = "";
  constructor(private _userService: UserService, private router: Router) {}

  ngOnInit(): void {
    this.registerForm = new FormGroup({
      username: new FormControl('', [Validators.required]),
      name: new FormControl('', [Validators.required]),
      email: new FormControl('', [
          Validators.required,
          Validators.pattern("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"),
      ]),
      password: new FormControl('', [Validators.required, Validators.minLength(8)]),
      role: new FormControl('user', [Validators.required]),
  });
  }

  checkUsernameAlreadyExists(){
    this._userService
      .getUserByUsername(this.registerForm.value.username)
      .subscribe({
        next : (result:any) => {
          if(result.username == "" || result.username == null){
            this.usernameExists = false;
          }else {
            this.alreadyExistingUsername = result.username;
            this.usernameExists = true;
          }
        },
        error : (error:any) => {
          (error: HttpErrorResponse) =>             
            this.usernameExists = false;
          ;
        }
      });
  }
  checkUsernameAlreadyExistsReset() {
    this.usernameExists = false;
    this.alreadyExistingUsername = "";
  }
  register() {
    // let isAdmin = this.registerForm.value.role === 'user' ? "user" : "admin";
    this._userService
      .register({
        name: this.registerForm.value.name,
        email: this.registerForm.value.email,
        password: this.registerForm.value.password,
        username: this.registerForm.value.username,
        userType: this.registerForm.value.role,
      })
      .subscribe({
        next: (result) => {
          //alert(result);
          this.router.navigate(['/login']);
        },
        error: (error: HttpErrorResponse) => handleErrorResponse(error, this.router),
      });
  }
}
