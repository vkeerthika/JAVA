package com.inh;
class Employee1{
	float Salary;
	Employee1(){
		Salary=80000;
			System.out.println("Employee constructor");
		}
	}
 class Programmer1{
	 float bomus,tsal;
	 
	 Employee1 eob1=new Employee1(); //HAS-A relation

	private float bonus;
	 public Programmer1() {
		 int bonus = 800;
		 System.out.println("Programmer constructor");
	 }
	 void totalSalary() {
		 tsal=eob1.Salary+bonus;
		 System.out.println("Programmer total salary="+tsal);
	 }
 }
	
public class EmpMain1 {

	public static void main(String[] args) {
		Programmer1 pob=new Programmer1();
		pob.totalSalary();

	}

}
