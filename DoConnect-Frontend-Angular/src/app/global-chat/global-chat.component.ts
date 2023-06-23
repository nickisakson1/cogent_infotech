import { Component, OnDestroy, OnInit } from '@angular/core';
import { ChatService } from '../service/chat.service';
import { getCurrentUsername, isUserAdmin } from '../utils/util';
import { FromUserToUser, chatmessage, globalChatMessageType, globalChatmessage } from '../constants/constants';
import { CommonModule } from '@angular/common';


const CHAT_REFRESH_FRQUENCY_IN_SECONDS = 1;

interface ChatMessage {
  message: string;
  postedBy: string;
  postedAt: Date;
}

@Component({
  selector: 'app-global-chat',
  templateUrl: './global-chat.component.html',
  styleUrls: ['./global-chat.component.css'],
})

export class GlobalChatComponent implements OnInit, OnDestroy {

  message: string;
  chatMessageList: globalChatmessage[];
  isUserAdmin: boolean;
  interval: number | null = null;
  currentUsername?: string = getCurrentUsername();

  futu:FromUserToUser= new FromUserToUser(
    this.currentUsername as string, "" as string
  );
  futuResults:globalChatmessage[]=[];
  chatMessageSend:globalChatMessageType=new globalChatMessageType();


  constructor(private _chatservice: ChatService) {
    this.message = '';
    this.chatMessageList = [];
    this.isUserAdmin = isUserAdmin();
  }

  ngOnInit(): void {
    this.currentUsername = getCurrentUsername();
    this.futu.fromuser =this.currentUsername as string;
    if (true) {
      this.fetchChatMessages();
      this.interval = window.setInterval(() => {
        this.fetchChatMessages();
      }, 
      CHAT_REFRESH_FRQUENCY_IN_SECONDS * 1000
      );
    }
  }

  ngOnDestroy(): void {
    if (!this.isUserAdmin && this.interval) {
      clearInterval(this.interval);
      this.interval = null;
    }
  }

  fetchChatMessages() {
    this.futu.fromuser = getCurrentUsername() as string;
    this.futu.touser = "" as string;

    // console.log(this.futu);
    this._chatservice.getGlobalChatMessagesList().subscribe({
      next: (results:any) => {
          // console.log(results)
          // this.chatMessageList = results as ChatMessage[]
          this.futuResults = results;
      },
      error: (error:any) => console.error('Error while fetching chat messages list. Details: ', error),
    });
    // console.log(this.futuResults);
  }

  onSendMessage() {
    if (this.message){
      this.chatMessageSend.datetime = (new Date().getTime() as any) as string;
      this.chatMessageSend.fromuser =getCurrentUsername() as string;
      this.chatMessageSend.message = this.message as string;
      this._chatservice.addGlobalChat(this.chatMessageSend).subscribe({
        next: (results) => {
          this.message = '';
          this.chatMessageList = results as globalChatmessage[];
        },
        error: (error) => console.error('Error while sending chat message. Details: ', error),
      });
    }
    }
}
