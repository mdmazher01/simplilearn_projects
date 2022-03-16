import { Component, OnInit } from '@angular/core';
import { AppserviceService } from '../appservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userreset',
  templateUrl: './userreset.component.html',
  styleUrls: ['./userreset.component.css']
})
export class UserresetComponent implements OnInit {


  userResetData={
    username:"",
    password:""
  }
  constructor(private app:AppserviceService, private router:Router) { }

  ngOnInit(): void {
  }

  userReset(userresetdata:any){
    this.app.userReset(userresetdata).subscribe();
    userresetdata="";
    alert("Reset account successfully")
    this.router.navigate(["userlogin"])
  }

}
