package com.firstproject;

public class Department {
	private Integer depId;
	private String deptName;
	private Employee1[] employees;
	
	public Department(Integer depId, String deptName, Employee1[] employees) {
		
		this.depId = depId;
		this.deptName = deptName;
		this.employees = employees;
	}

	public void display()
	{
		System.out.println(depId);
		System.out.println(deptName);
		System.out.println("***employee details are****");
		for(Employee1 employee : employees)
		{
			System.out.println(employee.geteName());
			System.out.println(employee.geteId());
			System.out.println();
		}
	}
	

}
