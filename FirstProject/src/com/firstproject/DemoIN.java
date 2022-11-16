package com.firstproject;
interface Demo1
{
	void add();
	
	default void show()
	{
		System.out.println("hjsaghdjlj");
	}
	static void display()
	{
		System.out.println("i am private");
	}
}
class Add implements Demo1
{
	public void add()
	{
		System.out.println("addition");
	}
	public void show()
	{
		
	}
	
}
public class DemoIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 demo=new Add();
		demo.add();
		demo.show();
		

	}

}
