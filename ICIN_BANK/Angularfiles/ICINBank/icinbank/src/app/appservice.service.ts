import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AppserviceService {

  Rd: any=[];
  s1: string="";
  s2: string="";
  s5: string="";
  s13: string="";
  s111: string="";
  constructor(private http: HttpClient) { }

  API = 'http://localhost:9196'

  public register(Data:any){
    return this.http.post(this.API + '/register',Data.value);
  }

  public getUserData(userlogData:any){
    return this.http.get(this.API + '/byname/'+ userlogData.username +'/'+ userlogData.password)
  }

  receivedData(userlogData:any){
      this.Rd=userlogData;
  }

  getData(){
    return this.Rd;
  }

  public addBalance(baldata:any,username:string){
    return this.http.put(this.API + '/add/'+username,baldata.value)
  }

  public withdrawMoney(username:string, withdata:any){
    return this.http.put(this.API + '/withdraw/'+username,withdata.value)
  }

  public transferMoney(username:string, trandata:any){
    return this.http.put(this.API + '/transfer/'+username,trandata.value)
  }

  public transferMoneyBetweenAccount(username: string, bdata:any){
    return this.http.put(this.API + '/betweenaccount/'+username,bdata.value)
  }

  public request(accountdatas:any,username:string){
      this.s1=accountdatas.value.accounts;
      this.s2=username;
  }

  public getrequest(){
    return this.s1,this.s2;
    
  }

  public userReset(userresetdata:any){
    return this.http.put(this.API + '/reset',userresetdata.value)
  }


  public getAdmin(){
    return this.http.get(this.API + '/admin')
  }

  public adminreset(adminresetdata:any){
    return this.http.put(this.API + '/admin/reset',adminresetdata.value)
  }

  public getAllAccount(){
    return this.http.get(this.API + '/allaccount')
  }

  public status(username:string, statusdata:any){
    return this.http.put(this.API + '/status/'+username,statusdata.value)
  }

  approvedByAdmin(s10:string,s3: string){
    this.s5= s10;
    this.s111=s3;
  }
  
}


