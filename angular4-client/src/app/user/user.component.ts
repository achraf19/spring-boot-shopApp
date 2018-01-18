import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { User } from './user';
import { UserService } from './user.service';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  listOfUsers: User[];
  user: User = {
  id:0,
  firstName:'',
  lastName:'',
  email:'',
  password:'',
  address: {
  		city:'',
  		postalCode:'',
  		street:''
  	}
  
  };
  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.getUsers();
  }


  getUsers(): void {
     this.userService.getUsers()
         .subscribe(res => { this.listOfUsers = res;
                             console.log(this.listOfUsers[0]);
                },
                (err: HttpErrorResponse ) => {
                    if (err.error instanceof Error) {
                      console.log('Client side error');
                    } else {
                      console.log(err.message);
                    }
                }

        );
  }

  SignUpUser() {
      this.userService.SignUpUser(this.user);
		  
    }



}
