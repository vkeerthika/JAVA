package com.java;

import java.util.Scanner;

class Employee{
	 int age; 
	 String name;
	 float salary; 
	
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name :");
		name=sc.nextLine();
		System.out.println("Enter age :");
		age=sc.nextInt();
		System.out.println("Enter salary :");
		salary=sc.nextFloat();
	}
	
	public void employeeDisplay() { 
		System.out.println("Name="+name);
		System.out.println("age="+age);
		System.out.println("salary="+salary);
	}
}

public class employeeMain {

	public static void main(String[] args) {
		System.out.println("main method");
		Employee employeeobject1=new Employee();
		employeeobject1.inputData();
		employeeobject1.employeeDisplay();
		Employee employeeobject2=new Employee(); 
		employeeobject2.inputData();
		employeeobject2.employeeDisplay();	

	}

}
