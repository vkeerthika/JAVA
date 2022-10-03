package com.java;

public class operatorsExperiment {

	public static void main(String[] args) {
		int num1,num2;
		num1=10;
		num2=20;
		int output=num1+num2;
		System.out.println("Addition"+output);
		int output1=num1-num2;
		System.out.println("Subtraction"+output);
		int output2=num1*num2;
		System.out.println("Multiplication"+output);
		int output3=num1/num2;
		System.out.println("Division"+output);
		int output4=num1%num2;
		System.out.println("Modules division"+output);
		double no=10,resultNo;
		boolean flag=true;
		System.out.println("+no"+ +no);
		System.out.println("+no"+ -no);
		System.out.println("+no"+ ++no);
		System.out.println("+no"+ --no);
		System.out.println("!flag="+!flag);
		if(num1>num2) {
			System.out.println("no1 is greater than no2");
		}
		if (num1<num2) {
			System.out.println("no 1 is less than no 2");
		}
		if(num1==num2) {
			System.out.println("no 1 is equal to no 2");
		}
		 int num3=20;
		 boolean result;
		 result=(num1>num2)||(num3>num1);
		 System.out.println("logical operator is: "+result);
		 result=(num1>num2)&&(num3>num1);
		 System.out.println("logical operator is: "+result);
		 
		  
		  int a=50;
		  int b=40;
		  int c=0;
		  c=a&b;
		  System.out.println("a&b="+c);
		  c=a|b;
		  System.out.println("a|b="+c);
		  c=a^b;
		  System.out.println("a^b="+c);
		  c=~a;
		  System.out.println("~a"+c);
		  
		  c=a>>2;
		  System.out.println("a>>2 ="+c);
		  c=a<<2;
		  System.out.println("a<<2 ="+c);
		  
		 
			
		}
			
		
		
	}


