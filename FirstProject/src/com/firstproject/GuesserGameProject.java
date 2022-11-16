package com.firstproject;

import java.util.Scanner;

class Guesser
{
	int GuesserNumber;
	public int GuesserNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the guesser number");
		return GuesserNumber=sc.nextInt();
	}
}
class player
{
	int pguessedNumber;
	public int pguessedNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the player guessed number");
		return pguessedNumber = sc.nextInt();
	}
}
class Umpire
{
	int GueeserNumberfromGuesser;
	int pguessedNumberfromplayer1;
	int pguessedNumberfromplayer2;
	int pguessedNumberfromplayer3;
	
	public void GueeserNumberfromGuesser()
	{
		Guesser a=new Guesser();
		GueeserNumberfromGuesser=a.GuesserNumber();
	}
	public void pguessedNumberfromplayers()
	{
		player p1=new player();
		player p2=new player();
		player p3=new player();
		pguessedNumberfromplayer1=p1.pguessedNumber();
		pguessedNumberfromplayer2=p1.pguessedNumber();
		pguessedNumberfromplayer3=p1.pguessedNumber();
	}
	public void Compare()
	{
		if(GueeserNumberfromGuesser ==pguessedNumberfromplayer1)
		{
			if(GueeserNumberfromGuesser==pguessedNumberfromplayer2 &&  GueeserNumberfromGuesser==pguessedNumberfromplayer3)
			{
				System.out.println("three players win");
			}
			else if(GueeserNumberfromGuesser==pguessedNumberfromplayer2)
			{
				System.out.println("player1 and player2 win");
			}
			else if(GueeserNumberfromGuesser==pguessedNumberfromplayer3)
			{
				System.out.println("player1 and player3 win");
			}
			else
			{
				System.out.println("player1 win the game");
			}
		}
			
		
		else if(GueeserNumberfromGuesser ==pguessedNumberfromplayer2)
		{
			if(GueeserNumberfromGuesser ==pguessedNumberfromplayer3)
			{
				System.out.println("player2 and player3 wins");
			}
			else {
			System.out.println("player2 win");
		}
		}
		else if(GueeserNumberfromGuesser ==pguessedNumberfromplayer3)
		{
			System.out.println("player3 wins");
		}
		else
		{
			System.out.println("all players lost and try again");
		}
		
	}

}

public class GuesserGameProject {

	public static void main(String[] args) {
		Umpire a= new Umpire();
		a.GueeserNumberfromGuesser();
		a.pguessedNumberfromplayers();
		a.Compare();
		

	}

}
