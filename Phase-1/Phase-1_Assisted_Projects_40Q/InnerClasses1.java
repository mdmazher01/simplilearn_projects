package com.mazher.practice;

public class InnerClasses1 {
	
	
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {
		InnerClasses1 obj=new InnerClasses1();
		InnerClasses1.Inner in=obj.new Inner();  
		in.hello();  

	}

}

