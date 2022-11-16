package com.firstproject;

public class Student2 {
	private Integer sId;
	private String sName;
	private Integer sAge;
	private Courses[] courses;
	public Student2(Integer sId, String sName, Integer sAge, Courses[] courses) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.courses = courses;
	}
	public void display()
	{
		System.out.println("student id is : "+sId);
		System.out.println("student Name is : "+sName);
		System.out.println("student Age is : "+sAge);
		for(Courses course:courses)
		{
			System.out.println("**course details are**");
			System.out.println(course.getcId());
			System.out.println(course.getcName());
			System.out.println(course.getCost());
			
		}
		
	}

}
