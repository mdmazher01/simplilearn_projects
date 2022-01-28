package com.mazher.practice;

public class Method_CallByValue {
	public static void main(String[] args) {
		Method_CallByValue d = new Method_CallByValue();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
}
	
	int val=150;
	int operation(int val) {
		val =val*10/100;
		return(val);
	}

}
