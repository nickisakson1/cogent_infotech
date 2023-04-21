import { Component, OnInit } from "@angular/core";
import { UserService } from "./user.service";
import { User } from "./user";
import { Directive, Output, EventEmitter, Input, SimpleChange} from '@angular/core';

@Component({
    selector:'app-user',
    templateUrl:'./user.component.html'
})
export class UserComponent implements OnInit {

    users:User[];
    counter=0;
    userTemp:User;

    constructor(private userService:UserService) {
        this.users=[];
        this.userTemp = new User(0, "UserName", 0, 0);
    }

    ngOnInit(): void {
        this.userService.getUsers().subscribe((data:User[])=>{
            console.log(data);
            this.users=data;
        });
    }

    addUser(addform:any) {
        let user = new User(this.counter, addform.value.userName, addform.value.userAge, addform.value.userSalary);
        this.userService.updateUser(user);
        this.counter=this.counter+1;
        this.userTemp.setUserId(this.counter);
        this.userTemp.setUserName("UserName");
        this.userTemp.setUserAge(0);
        this.userTemp.setUserSalary(0);
        this.ngOnInit();
    }

    updateUser(i:number) {
        this.userService.updateUser(this.users[i]);
        this.ngOnInit();
    }

    editUser(i:number) {
        this.users[i].showForm=true;
    }

    cancelForm(i:number) {
        this.users[i].showForm=false;
    }

    deleteUser(i:number) {
        this.userService.deleteUser(this.users[i].userId);
        this.ngOnInit();
    }

    resetForm() {
        this.userTemp.setUserId(this.counter);
        this.userTemp.setUserName("UserName");
        this.userTemp.setUserAge(0);
        this.userTemp.setUserSalary(0);
        this.ngOnInit();
    }
    
}

