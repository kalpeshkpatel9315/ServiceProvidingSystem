package com.calculator;

import java.util.Scanner;
public class Addition1 
{
	public static void main(String args[])
	{
		int choice=1;
		int num1=0,num2=0;
		Scanner sc=new Scanner(System.in);
		while(choice!=0)
		{
		System.out.println("Choice:-");
		System.out.println("0.Exit");
		System.out.println("1.Addtion");
		System.out.println("2.Subtraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter 1st Number");
				num1=sc.nextInt();
				System.out.println("Enter 2nd Number");
				num2=sc.nextInt();
				System.out.println("Sum is:="+(num1+num2));
				break;
				
			case 2:
				System.out.println("Enter 1st Number");
				num1=sc.nextInt();
				System.out.println("Enter 2nd Number");
				num2=sc.nextInt();
				System.out.println("Subtraction is:="+(num1-num2));
				break;
			case 3:
				System.out.println("Enter 1st Number");
				num1=sc.nextInt();
				System.out.println("Enter 2nd Number");
				num2=sc.nextInt();
				System.out.println("Division is:="+(num1/num2));
				break;
			case 4:
				System.out.println("Enter 1st Number");
				num1=sc.nextInt();
				System.out.println("Enter 2nd Number");
				num2=sc.nextInt();
				System.out.println("Multiplication is:="+(num1*num2));
				break;
			default:
				System.out.println("invalid input");
		}
		
		}
		sc.close();
	}
}
