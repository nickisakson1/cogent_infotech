import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ConditionalExpr } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { Observable } from "rxjs";
import { AnswerPostType, QuestionPostType, BASE_URL, User, UserLoginType, UserRegisterType, UserType, AnswerType } from '../constants/constants';
import { getCurrentUsername, handleErrorResponse, isUserAdmin, isUserLoggedIn } from '../utils/util';

@Injectable({
  providedIn: 'root',
})

export class UserService {

  constructor(private http: HttpClient) {}

  getUserObjectByUsername():Observable<UserType>{
    return this.http.get<UserType>(`${BASE_URL}/getuserbyusername/${getCurrentUsername()}`);
  }

  register(user: UserRegisterType) {
    return this.http.post(`${BASE_URL}/addnewuser`, user, { responseType: 'text' });
  }

  login(user: UserLoginType) {
    return this.http.post(`${BASE_URL}/authenticate`, user,{responseType: 'text'});
  }

  sendEmail(){
    return this.http.post("https://mailthis.to/DoConnect","User sent an email", { responseType: 'text' });
  }

  getQuestion(id: number) {
    return this.http.get(BASE_URL + '/getallquestionsbyid/' + id);
  }

  getApprovedQuestions() {
    return this.http.get(BASE_URL + '/question/getallquestionstrue');
  }

  postQuestion(question: QuestionPostType) {
    return this.http.post(BASE_URL + '/addquestion', question);
  }

  getQuestionById(id:number) {
    return this.http.get(BASE_URL + `/getquestionbyid/${id}`);
  }

  postAnswer(answer: AnswerPostType) {
    return this.http.post(BASE_URL + `/addanswer`, answer);
  }

  searchQuestion(query: string, topic: string) {
    return this.http.get(`${BASE_URL}/questions?search=${query}&topic=${topic}`);
  }

  getAnswers(questionId: number) {
    return this.http.get(BASE_URL + `/getallanswerbyquestionid/${questionId}`);
  }

  logout() {
    return this.http.get(BASE_URL + '/signout', { responseType: 'text' });
  }

  getUserByUsername(username:string): any {
    return this.http.get(BASE_URL + `/getuserbyusername/${username}`)
  }
}
