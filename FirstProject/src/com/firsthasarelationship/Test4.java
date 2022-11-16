package com.firsthasarelationship;

import com.firstproject.Courses;
import com.firstproject.Student2;

public class Test4 {

	public static void main(String[] args) {
		Courses course1=new Courses(1, "java", 1000);
		Courses course2=new Courses(2, "python", 500);
		Courses course3=new Courses(3, "javaScript", 1500);
		Courses[] c1=new Courses[3];
		c1[0]=course1;
		c1[1]=course2;
		c1[2]=course3;
		Courses[] c2=new Courses[2];
		c2[0]=course1;
		c2[1]=course2;
		Courses[] c3=new Courses[2];
		c3[0]=course1;
		c3[1]=course3;
	
		Student2 s1=new Student2(10, "sachin", 45, c1);
		Student2 s2=new Student2(11, "dhoni", 40, c2);
		Student2 s3=new Student2(12, "kohli", 35, c3);
		s1.display();
		s2.display();
		s3.display();

	}

}
