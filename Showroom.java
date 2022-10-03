package com.emp;

import java.util.Scanner;

public class Showroom {
String cname;
long mobno;
double cost;
double discount;
double amount;

void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the customer name: ");
	 cname = sc.next();
	System.out.println("Enter mobileno: ");
	mobno=sc.nextLong();
	System.out.println("Enter cost: ");
	cost=sc.nextDouble();
}
void calculate() {
	
	if(cost<=10000) {
		discount=cost*5/100;
		amount=cost-discount;
	}else if(cost>10000 && cost<=20000) {
		discount=cost*10/100;
		
	}else if(cost>20000 && cost<=350000){
	discount=cost*20/100;
	amount=cost-discount;
	}
		}
void display() {
	System.out.println("customer name="+cname);
	System.out.println("mobile number="+mobno);
	System.out.println("amount to be paid after discount="+amount);
	
	}
	public static void main(String[] args) {
	Showroom obj=new Showroom();
	obj.input();
	obj.calculate();
	obj.display();
	}

}
