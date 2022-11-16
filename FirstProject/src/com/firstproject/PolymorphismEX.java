package com.firstproject;


class plane
{
	public void fly()
	{
		System.out.println("plane is flying");
	}
	public void takeoff()
	{
		System.out.println("plane is takeoff");
	}
}
class Cargooplane extends plane{
	public void fly()
	{
		System.out.println("cargoplane flying ");
	}
	public void takeoff()
	{
		System.out.println("cargoplane takeoff");
	}
}
class PassengerPlane extends plane
{
	public void fly()
	{
		System.out.println("PassengerPlane flying");
	}
	public void takeoff()
	{
		System.out.println("passenger plane take off");
	}
}
class Airplane
{
	public void commit(plane p)
	{
		p.fly();
		p.takeoff();
	}
}
public class PolymorphismEX {

	public static void main(String[] args) {
		//plane p;
		Cargooplane cp=new Cargooplane();
		PassengerPlane pp=new PassengerPlane();
		Airplane a=new Airplane();
		a.commit(cp);
		a.commit(pp);
		

	}

}
