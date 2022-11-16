package com.firsthasarelationship;

import com.firstproject.Address;
import com.firstproject.Student;

public class Test {

	public static void main(String[] args) {
		Address address= new Address(10-336, "kranthinagar", "AndhraPradesh", 517501);
		Student student=new Student(420, "lakshi", 23, "female",address );
		student.display();
		

	}

}
