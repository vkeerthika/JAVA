package com.java;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int a,b,c,sp;
		double a3;
		System.out.println("Enter the value of sides");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		c=r.nextInt();
		sp=(a+b+c)/2;
		a3=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println("Area of Triangle is : "+a3);
		

	}

}
