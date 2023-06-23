import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BASE_URL, FromUserToUser } from '../constants/constants';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})

export class ChatService {


  constructor(private http: HttpClient) {}

  createChat(data: any) {
    return this.http.post(BASE_URL + '/messages', data);
  }

  addChat(data: any) {
    return this.http.post(BASE_URL + '/chat/addchat', data);
  }


  getChatMessagesList(fromuser:string, touser:string) {
    return this.http.get(BASE_URL + `/chat/getallchatbetweentwousers/${fromuser}/${touser}`);
  }

  addGlobalChat(data: any) {
    return this.http.post(BASE_URL + '/globalchat/addchat', data);
  }
  getGlobalChatMessagesList() {
    return this.http.get(BASE_URL + `/globalchat/getchat`);
  }
}

