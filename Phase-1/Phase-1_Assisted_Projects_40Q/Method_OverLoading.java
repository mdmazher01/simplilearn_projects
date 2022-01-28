package com.mazher.practice;

public class Method_OverLoading {

	public static void main(String[] args) {
		Method_OverLoading ob=new Method_OverLoading();
	       ob.area(10,12);
	       ob.area(5);  
	}
	
	public void area(int b,int h){
         System.out.println("Area of Triangle : "+(0.5*b*h));
		}
    public void area(int r) {
         System.out.println("Area of Circle : "+(3.14*r*r));
    	}
	
}
