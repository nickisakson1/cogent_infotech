import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
  })
  
export class EmailService {
    private url = ""
    constructor(private http:HttpClient){

    }
  
    // SendEmail(input: any) {
    //     return this.http.post(this.url, input, response).pipe(
    //         map(
    //         (response) => {
    //             if (response) {
    //           return response
    //             }
    //         },
    //         (error) => {
    //             if (error) {
    //           return error
    //             }
    //          }
    //       )
    //       )
    //   }
  }