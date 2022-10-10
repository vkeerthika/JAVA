package com.java;
class StudentEdu{
	int sid;
	String sname;
	float sfees;
	
	public StudentEdu(int sid, String sname, float sfees) {
		this.sid=sid; 
		this.sname=sname;
		this.sfees=sfees;
	}
	
	void display() {
		System.out.println("Student id="+sid);
		System.out.println("Student name="+sname);
		System.out.println("Student fees="+sfees);
	}
}
public class ConstructorArgument {

	public static void main(String[] args) {
		StudentEdu sob1=new StudentEdu(1,"harish",7980.5f);
		StudentEdu sob2=new StudentEdu(2,"keerthi",8457.6f);
		StudentEdu sob3=new StudentEdu(3,"krithik",6908.6f);
		
		sob1.display();
		sob2.display();
		sob3.display();
	}

}
