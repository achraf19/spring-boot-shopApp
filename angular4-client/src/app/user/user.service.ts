import { Injectable } from '@angular/core';
import { User } from './user';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';



@Injectable()
export class UserService {
  private URL = 'http://localhost:8080';
  private headers = new HttpHeaders({'Content-Type': 'application/text'});
  constructor(private httpClient: HttpClient) { }


  SignUpUser(user: User) {
       return this.httpClient.post(this.URL + '/user/signup', user);

  }

  getUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.URL + '/user/getAll');
  }

}






