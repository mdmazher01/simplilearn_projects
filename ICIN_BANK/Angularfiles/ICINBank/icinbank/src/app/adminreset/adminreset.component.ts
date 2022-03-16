import { Component, OnInit } from '@angular/core';
import { AppserviceService } from '../appservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminreset',
  templateUrl: './adminreset.component.html',
  styleUrls: ['./adminreset.component.css']
})
export class AdminresetComponent implements OnInit {

  adminResetData={
    name:"",
    password:""

  }
  constructor(private app:AppserviceService, private router:Router) { }

  ngOnInit(): void {
  }

  adminreset(adminresetdata:any){
    this.app.adminreset(adminresetdata).subscribe();
    alert("Data update successfully")
    adminresetdata="";
  }
}
