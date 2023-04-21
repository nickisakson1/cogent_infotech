import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from "./user";
import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';

@Injectable({
    providedIn:'root'
})
export class UserService {

    private baseUrl="http://localhost:8080/api/user";

    constructor(private http:HttpClient) {

    }

    getUsers():Observable<User[]> {
        return this.http.get<User[]>(`${this.baseUrl}`);
    }

    updateUser(user:User) {
        this.http.post(`${this.baseUrl}`, user);
    }

    deleteUser(id:number) {
        let urls=`${this.baseUrl}/`+id;
        this.http.delete(urls);
    }

}