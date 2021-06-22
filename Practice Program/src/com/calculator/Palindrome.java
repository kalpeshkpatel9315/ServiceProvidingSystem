package com.calculator;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:-");
		int no=sc.nextInt();
		int temp=no;
		int r,rev=0;
		while(no!=0)
		{
			r=no%10;
			rev=rev*10+r;
			no=no/10;
		}
		System.out.println("Reverse number:-"+rev);

	}

}
