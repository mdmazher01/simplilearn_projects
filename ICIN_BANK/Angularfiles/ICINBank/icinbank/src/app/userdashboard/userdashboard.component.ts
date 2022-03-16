import { Component, OnInit } from '@angular/core';
import { AppserviceService } from '../appservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-userdashboard',
  templateUrl: './userdashboard.component.html',
  styleUrls: ['./userdashboard.component.css']
})
export class UserdashboardComponent implements OnInit {

  Rc={
    username:"",
    password:""
  };
  d: any=[];
  acc={
    account:""
  }
  a={
    accounts:""
  }
  s7: string="";
  s8: string="";
  flag: boolean=false;
  

  constructor(private app:AppserviceService, private router:Router) {
  
    this.Rc=this.app.getData();
    this.getDatas(this.Rc);
   
    
    
    

    }

  ngOnInit(): void {
    this.s7=this.app.s5;
    this.s8= this.app.s111;
  }
   
  getDatas(Rc:any){
    this.app.getUserData(Rc).subscribe(Data => {
        this.d=Data;
    })

  }

  addBalance(baldata:any,username:string){
    
    this.app.addBalance(baldata,username).subscribe();
    baldata="";
    alert("Balance added successfully");
    this.getDatas(this.Rc);
    
  }

  withdrawMoney(username:string, withdata:any){
    this.app.withdrawMoney(username,withdata).subscribe();
    withdata="";
    alert("Money withdraw successfully")
    this.getDatas(this.Rc);
    

  }

  transferMoney(username:string,trandata:any){
    this.app.transferMoney(username,trandata).subscribe();
    trandata="";
    alert("Money TransferState successfully");
    this.getDatas(this.Rc);
  }
   
  transferMoneyBetweenAccount(username:string,bdata:any){
    this.app.transferMoneyBetweenAccount(username,bdata).subscribe();
    bdata="";
    alert("Money TransferState successfully");
    this.getDatas(this.Rc);
    
  }
  getAll(){
    this.flag=true;
  }

  request(accountdatas:any,username:string){
    
    this.app.request(accountdatas,username);
    alert("Applied for cheque book successfully")
    console.log(accountdatas.value.accounts,username)
  }


  
}

