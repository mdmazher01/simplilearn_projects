import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AppserviceService } from '../appservice.service';

@Component({
  selector: 'app-homes',
  templateUrl: './homes.component.html',
  styleUrls: ['./homes.component.css']
})
export class HomesComponent implements OnInit {

  
  constructor(private app:AppserviceService,private router:Router) { }


  register(Data:NgForm){
    this.app.register(Data).subscribe(
 
      {
        next:(result: any) =>{
          console.log(result);
          Data.reset();
        },
        error:(err: any) =>{
          console.log(err);
          
        },
        complete:()=>{
          console.log('complete');
          Data.reset();
        }
      }
    )
    this.router.navigate(["userlogin"])
}


onSub(){
  this.router.navigate(["userlogin"])
}
  ngOnInit(): void {
  }

}
