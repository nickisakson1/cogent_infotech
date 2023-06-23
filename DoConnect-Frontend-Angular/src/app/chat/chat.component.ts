import { Component, OnDestroy, OnInit } from '@angular/core';
import { ChatService } from '../service/chat.service';
import { getCurrentUsername, getToUsername, isUserAdmin } from '../utils/util';
import { FromUserToUser, chatmessage,ChatMessageType } from '../constants/constants';

const CHAT_REFRESH_FRQUENCY_IN_SECONDS = 1;

interface ChatMessage {
  message: string;
  postedBy: string;
  postedAt: Date;
}

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.css'],
})

export class ChatComponent implements OnInit, OnDestroy {

  message: string;
  chatMessageList: ChatMessage[];
  isUserAdmin: boolean;
  interval: number | null = null;
  currentUsername?: string = getCurrentUsername();
  toUser?: string = getToUsername();
  futu:FromUserToUser= new FromUserToUser(
    this.currentUsername as string, this.toUser as string
  );
  futuResults:chatmessage[]=[];
  chatMessageSend:ChatMessageType=new ChatMessageType();

  
  constructor(private _chatservice: ChatService) {
    this.message = '';
    this.chatMessageList = [];
    this.isUserAdmin = isUserAdmin();
  }

  ngOnInit(): void {
    this.currentUsername = getCurrentUsername();
    this.toUser = getToUsername();
    this.futu.fromuser =this.currentUsername as string;
    this.futu.touser=this.toUser as string;
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
    this.futu.touser = getToUsername() as string;

    // console.log(this.futu);
    this._chatservice.getChatMessagesList(this.futu.fromuser,this.futu.touser).subscribe({
      next: (results:any) => (
          // console.log(results)
          // this.chatMessageList = results as ChatMessage[]
          this.futuResults = results
      ),
      error: (error:any) => console.error('Error while fetching chat messages list. Details: ', error),
    });
    // console.log(this.futuResults);
  }

  onSendMessage() {
    if (this.message){
    this.chatMessageSend.datetime = (new Date().getTime() as any) as string;
    this.chatMessageSend.fromuser =getCurrentUsername() as string;
    this.chatMessageSend.touser = getToUsername() as string;
    this.chatMessageSend.message = this.message as string;
    this._chatservice.addChat(this.chatMessageSend).subscribe({
      next: (results) => {
        this.message = '';
        // this.chatMessageList = results as ChatMessage[];
      },
      error: (error) => console.error('Error while sending chat message. Details: ', error),
    });
  }
  }
}
