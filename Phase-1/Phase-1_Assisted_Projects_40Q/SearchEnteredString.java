package com.mazher.practice;

import java.util.Scanner;

public class SearchEnteredString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below, what you want to search: ");
		String str = sc.next();
		String []arr = {"hello","bye","okay","thanks"};
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
			 System.out.println("Found: " + str);
			 }else{
			 System.out.println("Not Found: "+ str);
			 }
		 }

}
