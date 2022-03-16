import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AppserviceService } from '../appservice.service';
import { Router } from '@angular/router';
import { delay } from 'rxjs';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  userlogData={
    username:"",
    password:""
  }

  userDat: any=[];

  constructor(private app:AppserviceService, private router:Router) { }

  ngOnInit(): void {
  }


  userlog(){
    if((this.userlogData.username != '' && this.userlogData.password != '') && (this.userlogData.username != null && this.userlogData.password)){
      this.app.getUserData(this.userlogData).subscribe(Data =>{
        this.userDat=Data;
        
        if(this.userDat != '' &&((this.userlogData.username == this.userDat[0].username) && (this.userlogData.password == this.userDat[0].password))){
          if(this.userDat[0].status != 0){
            this.app.receivedData(this.userlogData);
            this.router.navigate(["userdashboard"])
          }
          else{
            this.userlogData.username="";
            this.userlogData.password="";
            alert("Your account is blocked, please contact Admin")
          }
          
        }
        else{
          alert("user not found");
          this.userlogData.username="";
          this.userlogData.password="";
        }

      });
    }
    else{
        alert("field cannot be empty");
        
         
    }
    
  }

  
}
