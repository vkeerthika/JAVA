package com.emp;

import java.util.Scanner;

public class BookFair {
String Bname;
double price,amt;

BookFair(){
	Bname="";
	price=0;
}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Book name: ");
		Bname=sc.next();
	System.out.println("Enter the price: ");
	price=sc.nextInt();
	}
	
void calculate() {
	if(price<=1000) {
		amt=2/100*price;
	}else if(price<=2000) {
		amt=3/100*price;
	}else {
		amt=15/100*price;
	}
}

	void display() {
		System.out.println("Book name ="+Bname);
		System.out.println("price ="+price);
		System.out.println("discount ="+amt); }
	
	public static void main(String[] args) {
		BookFair bf=new BookFair();
		bf.input();
		bf.calculate();
		bf.display();
	}

}
