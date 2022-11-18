package com.firsthasarelationship;

import com.firstproject.Account;
import com.firstproject.Employee;

public class Test1 {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccNo(12345);
		acc.setAccType("salary account");
		acc.setAccholdername("lakshmi");
		Employee emp=new Employee();
		emp.setEid(123);
		emp.setEname("lakshmi");
		emp.setEdepartment("developemt");
		emp.setAccount(acc);
		emp.display();
		
		System.out.println("jgsakuf");

	}

}
