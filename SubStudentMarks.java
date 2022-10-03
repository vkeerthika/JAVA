package com.java;
class subjects{
	int Science;
	int Social;
	int Maths;
}
public class SubStudentMarks {
public static void main(String[] args) {
   subjects stu=new subjects();
   stu.Science=80;
   stu.Social=98;
   stu.Maths=75;
   
   subjects stu2=new subjects();
   stu2.Science=60;
   stu2.Social=78;
   stu2.Maths=50;
   
   System.out.println("Marks of First Student");
   System.out.println("Science = "+stu.Science);
   System.out.println("Social = "+stu.Social);
   System.out.println("MAths = "+stu.Maths);
   
    System.out.println("Marks of Second Student");
   System.out.println("Science = "+stu2.Science);
   System.out.println("Social = "+stu2.Social);
   System.out.println("MAths = "+stu2.Maths);
   
		   
		   
		   
		   
	}

}
