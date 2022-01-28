package com.mazher.practice;

public class DefaultConstructor {
	public static void main(String[] args) {
		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();

		emp1.display();
		emp2.display();

	}

}

class EmpInfo{
	int id;
	String name;

	void display() {
		System.out.println(id+" "+name);
		}
}
