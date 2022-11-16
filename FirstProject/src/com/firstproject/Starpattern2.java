package com.firstproject;

import java.util.Scanner;

public class Starpattern2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to Reverse");
		String str= scan.nextLine();
		String[] s=str.split(" ");
		String[] temp=new String[s.length];
		
		for(int i=0;i<s.length;i++)
		{
			String str1=s[i];
			String temp1="";
			for(int j=str1.length()-1;j>=0;j-- )
			{
				temp1=temp1+str1.charAt(j);
			}
			temp[i]=temp1;
			
		}
		for(int k=0;k<temp.length;k++)
		{
			System.out.print(temp[k]+" ");
		}
		

	}

}
