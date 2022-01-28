package com.mazher.practice;

public class InnerClasses2 {
	
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  


	public static void main(String[] args) {
		
		InnerClasses2  ob=new InnerClasses2 ();  
		ob.display();  

	}

}
