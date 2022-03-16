import { Component, OnInit } from '@angular/core';
import { AppserviceService } from '../appservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent implements OnInit {
  s3: string="";
  s4: string="";
  allaccount: any=[];
  s5: string="Non-Active";
  s6: string="Active";
  s10: string="";
  constructor(private app:AppserviceService, private router:Router) {
      this.s3=this.app.s1;
      this.s4=this.app.s2;
      this.app.s1="";
      this.app.s2="";
      
      this.get();
      
   }

  ngOnInit(): void {
  }
  
  get(){
    this.app.getAllAccount().subscribe(Data =>{
      this.allaccount=Data;
    })
  }
  statuss(username:string, statusdata:NgForm){
    this.app.status(username,statusdata).subscribe();
    statusdata.reset();
    alert("Account status change successfully")
    this.get();
  }
   approved(){
     this.s10="Approved";
     this.app.approvedByAdmin(this.s10,this.s3);
     this.s3="";
     this.s4="";
   }
   
   decline(){
    this.s10="Decline";
    this.app.approvedByAdmin(this.s10,this.s3);
    this.s3="";
    this.s4="";
   }
}
