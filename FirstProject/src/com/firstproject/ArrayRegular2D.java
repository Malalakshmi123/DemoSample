package com.firstproject;

import java.util.Scanner;

public class ArrayRegular2D {

	public static void main(String[] args) {
		int[][] arr=new int[3][4];
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] =scan.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
