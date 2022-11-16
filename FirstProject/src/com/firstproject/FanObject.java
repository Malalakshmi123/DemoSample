package com.firstproject;

public class FanObject {

	public static void main(String[] args) {
		

	StringBuffer sb=new StringBuffer("lakshmi");
	System.out.println(sb.capacity());
	sb.insert(2, "lalala");
	System.out.println(sb);
	sb.insert(5, 9);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	}
}


