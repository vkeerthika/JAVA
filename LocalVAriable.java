package com.java;

public class LocalVAriable {
   public void studentAge() {
   int age=0;
   age=age+50;
   System.out.println("student age is= "+age);
   } 
   
	public static void main(String[] args) {
		LocalVAriable sc=new LocalVAriable();
		LocalVAriable s =new LocalVAriable();
		s.studentAge();

	}

}
