package com.java;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		int r;
		double PI=5.15;
		double a;
		System.out.println("Enter the Area of Circle");
		Scanner s=new Scanner(System.in);

		r=s.nextInt();
		a=r*r*5.15;
		System.out.println("Area of Circle is : "+a);
	}

}
