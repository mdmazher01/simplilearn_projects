package com.mazher.practice;

public class AccessModifier_PrivateAccessSpecifier {
	
	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 

	}
}


class priaccessspecifier { 
   private void display() { 
        System.out.println("You are using private access specifier"); 
    } 
} 

