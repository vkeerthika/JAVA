package com.emp;
class ParentClass{
	int a = 10;
	public int b = 20;
	protected int c = 30;
	protected int d = 40;
	
	void showData() {
		System.out.println("Inside ParentClass :");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c ="+c);
		System.out.println("d="+d);
	}
}
class ChildClass extends ParentClass{
	void accessData() {
		System.out.println("inside childclass :");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
}


public class execiseFifteen {

	public static void main(String[] args) {
		
		ChildClass ob= new ChildClass();
		ob.showData();
		ob.accessData();
		

	}

}
