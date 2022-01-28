package com.mazher.nonassisted;

import java.util.Scanner;

public class ValidationOfEmailId {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email, you want to search: ");
		String str = sc.next();
		String []arr = {"bob@gmail.com","rahul@gmail.com","raj@gmail.com"};
		searchString(str,arr);
	}
	public static void searchString(String str,String arr[]) {
		 boolean contains = false;
		 for(int i=0; i < arr.length; i++){
			 if(arr[i].equals(str)) {
				 contains = true;
				 break;
			 }
				 
		 }
		 if(contains){
			 System.out.println("Email ID Found: " + str);
			 }else{
			 System.out.println("Email ID Not Found: "+ str);
			 }
		 }
		
	}
