package com.firstproject;

class Alien
{
	private int age;
	private String name;
	public Alien()
	{
		this(199,"lakshmi");
	}
	public Alien(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	public Alien(int age)
	{
		this();
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class EncapsuationEx {

	public static void main(String[] args) {
		
		Alien a=new Alien();
		Alien a1=new Alien(16);
		System.out.println(a.getAge());
		System.out.println(a.getName());
		System.out.println(a1.getAge());
		System.out.println(a1.getName());

	}

}
