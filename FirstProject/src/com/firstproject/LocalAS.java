package com.firstproject;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LocalAS {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter 2 strings to check anagram or not");
		String str1=scan.next();
		String str2=scan.next();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<str1.length();i++)
		{
			if(ch1[i]!=ch2[i])
			{
				System.out.println("not anagram");
				System.exit(0);
			}
		}
		System.out.println("anagram");
	}

}
