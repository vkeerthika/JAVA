package com.emp;

import java.util.Scanner;

public class RailWayTickets {
	String name,coach;
	long mobileno;
	int amount, totalamount;
	 
	void accept() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name: ");
name=sc.nextLine();
System.out.println("Enter the coach: ");
coach=sc.nextLine();
System.out.println("Enter the mobile number: ");
mobileno=sc.nextInt();
System.out.println("Enter the amount: ");
amount=sc.nextInt();
	}
	 void update() {
		 if (coach.equals("Frist_AC")) {
			 totalamount=amount+700;
		 }else if (coach.equals("Second_AC")) {
		 totalamount=amount+500;
		 }else if(coach.equals("Third_AC")) {
			 totalamount=amount+250;
		 }else if (coach.equals("Sleeper")) {
			 System.out.println("None");
			 
		 }
		 		
	 }
	void display() {
		System.out.println("name is: "+name);
		System.out.println("coach is: "+coach);
		System.out.println("totalamount is: "+totalamount);
		System.out.println("mobileno is: "+mobileno);
	}
	public static void main(String[] args) {
		RailWayTickets tic=new RailWayTickets();
	    tic.accept();
	   
		tic.update();
		tic.display();

	}
	
	}
	
		
	


