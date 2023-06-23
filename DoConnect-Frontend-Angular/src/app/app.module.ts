import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AngularEditorModule } from '@kolkov/angular-editor';
import { DragDropModule } from '@angular/cdk/drag-drop';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { QuestionComponent } from './question/question.component';
import { PostQuestionComponent } from './post-question/post-question.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { ErrorComponent } from './error/error.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ChatComponent } from './chat/chat.component';
import { SecurePipe } from './utils/secure.pipe';
import { authInterceptorProviders } from './utils/auth.interceptor';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatGridListModule} from '@angular/material/grid-list';
import { GlobalChatComponent } from './global-chat/global-chat.component';
@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    QuestionComponent,
    PostQuestionComponent,
    PageNotFoundComponent,
    NavbarComponent,
    LoginComponent,
    HomeComponent,
    FooterComponent,
    ErrorComponent,
    DashboardComponent,
    ChatComponent,
    GlobalChatComponent,
    SecurePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    AngularEditorModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    DragDropModule,
    MatGridListModule
  ],
  exports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    AngularEditorModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    DragDropModule,
    MatGridListModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
