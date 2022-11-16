package com.firstproject;

public class Student {
	private Integer sid;
	private String sname;
	private Integer sage;
	private String sgenger;
	private Address adress;
	public Student(Integer sid, String sname, Integer sage, String sgenger, Address adress) {
		
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sgenger = sgenger;
		this.adress = adress;
	}
	public void display()   // one address object injected to one employee object so we can call this as one to one association
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
		System.out.println(sgenger);
		System.out.println("***************************");
		System.out.println(adress.getDoorNo());
		System.out.println(adress.getStreet());
		System.out.println(adress.getState());
		System.out.println(adress.getPinNo());
	}
}