package com.java;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
	int num = 120;
	double sum = 0;
	int d;
	int armnum = num;
	while (num > 0) {
		d = num % 10;
		sum = sum + Math.pow(d, 4);
		num = num / 10;
		}
	if (sum == armnum) {
		System.out.println(armnum + " is Armstrong number");

	} else {
		System.out.println(armnum + " is not armstrong number");
	}
}

}
