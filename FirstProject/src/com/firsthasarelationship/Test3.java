package com.firsthasarelationship;

import com.firstproject.Branch;
import com.firstproject.Student;
import com.firstproject.Student1;

public class Test3 {

	public static void main(String[] args) {
		Branch br=new Branch(1897, "tpt");
		Student1 stu1=new Student1(7, "sachin", 15, br);
		Student1 stu2=new Student1(8, "dhoni", 42, br);
		Student1 stu3=new Student1(9, "kohli", 25, br);
		stu1.display();
		stu2.display();
		stu3.display();

	}

}
