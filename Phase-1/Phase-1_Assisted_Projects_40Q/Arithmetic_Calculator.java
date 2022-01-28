package com.mazher.practice;
import java.util.*;
import java.util.Scanner;

public class Arithmetic_Calculator {
	public static void main(String[] args) {
		input();
	}
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		double number1 = sc.nextDouble();
		System.out.println("Enter Second Number: ");
		double number2 = sc.nextDouble();
		System.out.println("Enter Operator: + , - , * , /");
		char ch = sc.next().charAt(0);
		System.out.println();
		double result = 0;
			switch(ch) {
			case '+':
				result = number1+number2;
				System.out.println("Adition of Two Number: "+result);
				break;
			case '-':
				result = number1-number2;
				System.out.println("Subtraction of Two Number: "+result);
				break;
			case '*':
				result = number1*number2;
				System.out.println("Multiplication of Two Number: "+result);
				break;
			case '/':
				if(number2==0) {
					System.out.println("Division by zero not possible");
				}
				else {
					result = number1/number2;
					System.out.println("Division of Two Number: "+result);
				}
				break;
			default:
		        System.out.println("Invalid operator!, try again");
			}
		
}
}
