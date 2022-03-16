import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserregisterComponent } from './userregister/userregister.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminresetComponent } from './adminreset/adminreset.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { HomesComponent } from './homes/homes.component';
import { UserresetComponent } from './userreset/userreset.component';




@NgModule({
  declarations: [
    AppComponent,
    UserregisterComponent,
    UserloginComponent,
    UserdashboardComponent,
    AdminloginComponent,
    AdminresetComponent,
    AdmindashboardComponent,
    HomesComponent,
    UserresetComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
