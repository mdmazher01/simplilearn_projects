import { Component, OnInit } from '@angular/core';
import { AppserviceService } from '../appservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  adminlogData={
    name:"",
    password:""
  }
  admindataarray: any=[];
  constructor(private app:AppserviceService, private router:Router) { 
    this.getAdminAll();

   
  }

  ngOnInit(): void {
  }

  getAdminAll(){
    this.app.getAdmin().subscribe(Data =>{
      this.admindataarray=Data;
    })
  }

  adminlog(admindata:any){
    if((this.adminlogData.name != '' && this.adminlogData.password != '')&&(this.adminlogData.name != null && this.adminlogData.password != null)){
        if((this.adminlogData.name == this.admindataarray[0].name)&&(this.adminlogData.password == this.admindataarray[0].password)){
              this.router.navigate(["admindashboard"])
        }
        else{
          alert("Wrong Credential")
          admindata="";
        }
    }
    else{
      alert("field cannot be empty")
    }
  }
}
