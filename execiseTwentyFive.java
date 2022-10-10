package com.emp;


class STU {
	public void print_STU(){
		System.out.println("cooking");
		
	}
}
class UXY extends STU{
	public void print_UXY() {
		System.out.println("emerging technology");
	}
}
class PQR extends UXY{
	public void print_PQR() {
		System.out.println("iot student");
	}
}

public class execiseTwentyFive{

	public static void main(String[] args) {
		PQR d = new PQR();
		d.print_UXY();
		d.print_STU();
		d.print_PQR();
		

	}
}
