import { JwtPayload } from "jwt-decode";

export const BASE_URL = 'http://3.143.244.76:8080';
// export const BASE_URL = 'http://localhost:8080';

export interface JWTCustomPayload extends JwtPayload {
    user: {
        id: number;
        name: string;
        username: string;
        password: string;
        email: string;
        userType: string;
    }
}

export interface UserLoginType {
    userName: string;
    password: string;
}
export interface UserRegisterType {
    username: string;
    password: string;
    name: string;
    email: string;
    userType: string;
}

export interface User {
    id:number;
    username: string;
    password: string;
    name: string;
    email: string;
    userType: string;
}

export interface UserType extends Omit<UserRegisterType, 'password'> {
    id: number;
}

export interface QuestionPostType {
    description_question: string;
    status:string;
    datetime:string;
    topic: string;
    title: string;
    image_src: string;
    qcreated_by: any;
    qapproved_by: any;

}

export interface QuestionType extends QuestionPostType {
    id: number;
	datetime: string;
    answers: AnswerType;
}

export interface AnswerPostType {
    description_answer: string;
    img_src: string;
    acreated_by: any;
	datetime: string;
	aapproved_by: any;
	status: string;
    question_by: any;
    question: any;
}

export interface AnswerType {
    id: number;
    description_answer: string;
    img_src: string;
    acreated_by: any;
	datetime: string;
	aapproved_by: any;
	status: string;
    question: QuestionType;
    question_by: any;
}
export interface chatmessage{
    id:number;
    fromuser:string;
    touser:string;
    message:string;
    datetime:string;
}

export interface globalChatmessage{
    id:number;
    fromuser:string;
    message:string;
    datetime:string;
}
export class globalChatMessageType{
    fromuser:string = "";
    message:string = "";
    datetime:string = "";
}

export class ChatMessageType{
    fromuser:string="";
    touser:string="";
    message:string="";
    datetime:string="";
}

export class FromUserToUser{
    fromuser:string = ""; 
    touser:string = "";
    constructor(fromuser:string, touser:string){

    }
}


export const QUESTIONS_TOPICS = [
    'Actors',
    'Algebra',
    'Applications',
    'Arts',
    'Books',
    'Climate Change',
    'Comedy / Humour',
    'Commerce',
    'Computer Science',
    'Current Affairs',
    'Electronics',
    'Engineering',
    'Food',
    'Games',
    'General',
    'General Knowledge',
    'History',
    'Hobbies',
    'Humanity',
    'Information Technology',
    'Internet',
    'Mathematics',
    'Movies',
    'Music',
    'Pets',
    'Philosophy',
    'Programming',
    'Random',
    'Restaurants',
    'Science',
    'Television',
    'Travel',
    'Weather',
];
