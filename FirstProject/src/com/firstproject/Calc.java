package com.firstproject;

import java.util.Scanner;

abstract class shape
{
	Integer area;
	abstract public void input();
	abstract public void compute();
	public void display()
	{
		System.out.println("area is "+area);
	}
}
class Rectangle extends shape
{
	Integer len;
	Integer brd;
	public void input()
	{
		System.out.println("enter length and breadth");
		Scanner sc=new Scanner(System.in);
		 len= sc.nextInt();
		 brd=sc.nextInt();
	}
	public void compute()
	{
		area=len*brd;
	}
}
class Circle extends shape
{
	Integer rad;
	float pi=3.14f;
	public void input()
	{
		System.out.println("Enter Radius");
		Scanner sc=new Scanner(System.in);
		rad=sc.nextInt();
	}
	public void compute()
	{
		area=(int) (pi*rad*rad);
	}
}
class square extends shape
{
	Integer len;
	public void input()
	{
		System.out.println("Enter length");
		Scanner sc=new Scanner(System.in);
		len=sc.nextInt();
	}
	public void compute()
	{
		area=len*len;
	}
}
class Geometry
{
	public void permit(shape s)
	{
		s.input();
		s.compute();
		s.display();
	}
}
public class Calc {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		square s=new square();
		
		Geometry g=new Geometry();
		g.permit(r);
		g.permit(c);
		g.permit(s);
		

	}

}
