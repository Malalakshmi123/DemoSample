package com.firstproject;

public class Student1 {
	private Integer sId;
	private String sName;
	private Integer sAge;
	private Branch branch;
	public Student1(Integer sId, String sName, Integer sAge, Branch branch) {
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.branch = branch;
	}
	public void display() {
		System.out.println(sId+" "+sName+" "+sAge);
		System.out.println("****branch details are*****");
		System.out.println(branch.getbId()+" "+branch.getbName());
	}

}
