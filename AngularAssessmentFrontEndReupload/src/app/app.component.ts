import { Component } from '@angular/core';
import { User } from './user';
import { UserComponent } from './user.component';
import { Directive, Output, EventEmitter, Input, SimpleChange} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngularAssessmentFrontEnd';

  userTemp:User;
  counter=1;

  constructor() {
    this.userTemp=new User(0, '', 0, 0);
  }
  
}
