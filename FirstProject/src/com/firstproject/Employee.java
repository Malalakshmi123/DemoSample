package com.firstproject;

public class Employee {
	private Integer eid;
	private String ename;
	private String edepartment;
	private Account account;
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(edepartment);
		System.out.println("***employee account details*****");
		System.out.println(account.getAccNo());
		System.out.println(account.getAccType());
		System.out.println(account.getAccholdername());
		
	}
	
	

}
