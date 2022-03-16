import { Component } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';
import { AppserviceService } from './appservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'icinbank';
  j: string="";
  flag1: boolean=false;
  flag2: boolean=true;
  flag3: boolean=false;

  flag4: boolean=false;
  flag5: boolean=true;
  flag6: boolean=false;
  flag7: boolean=false;


  constructor(private app:AppserviceService,private router: Router){
    this.router.events.subscribe((ev) => {
      if(ev instanceof NavigationEnd){
        this.display2();
      }
    })
  }

  display2(){
    this.j=window.location.href;
    if((this.j=="http://localhost:4200/admindashboard")){
      this.flag2=false;
      this.flag4=true;
      this.flag5=true;
      this.flag6=true;
      this.flag1=true;
      
    
    }else{
      this.flag2=true;
      this.flag4=false;
      this.flag6=false;
      this.flag1=false;
      
    }

    if((this.j=="http://localhost:4200/userdashboard")){
        this.flag1=true;
        this.flag3=true;
        this.flag5=false;
        this.flag4=true;
        
    }else{
      this.flag5=true;
      this.flag3=false;
      
     
    }


    if((this.j == "http://localhost:4200/adminreset")){
      this.flag4=true;
      this.flag6=true;
    }
    if((this.j == "http://localhost:4200/userreset")){
        this.flag1=true;
        this.flag3=true;
    }

    if((this.j=="http://localhost:4200/admindashboard") || (this.j=="http://localhost:4200/userdashboard") ){
          this.flag7=true;
    }
    else{
      this.flag7=false;
    }
    
  }
}
