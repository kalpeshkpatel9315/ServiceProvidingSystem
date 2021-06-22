package com.calculator;

import java.util.Scanner;

public class addition 											
{
	static int ans=0;
	public static int sum(int num1,int num2)
	{
		
		ans=num1+num2;
		return ans;

	}
	public static int subtraction(int num1,int num2)
	{
		
		ans=num1-num2;
		return ans;
	}
	public static int division(int num1,int num2)
	{
		
		
		ans=num1/num2;
		return ans;
	}
	public static int multiplication(int num1,int num2)
	{
		ans=num1*num2;
		return ans;

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice=1;
		while(choice!=0)
		{
			
			System.out.println("Calculator:=");
			System.out.println("1: Sum");
			System.out.println("2: Subtraction");
			System.out.println("3: Division");
			System.out.println("4: Multiplication");
			System.out.println("0: for exit");
			choice=sc.nextInt();
			
			int num1=0,num2=0;
			
			if(choice==1)
			{
				System.out.println("Enter 1st number");
				num1=sc.nextInt();
				System.out.println("Enter 2nd number ");
				num2=sc.nextInt();
				
				ans=sum(num1,num2);
				System.out.println("Sum is:="+ans);
				
				
			}
			else if(choice==2)
			{
				System.out.println("Enter 1st number");
				num1=sc.nextInt();
				System.out.println("Enter 2nd number ");
				num2=sc.nextInt();
				
				ans=subtraction(num1,num2);
				System.out.println("Subtraction is:="+ans);
			}
			else if(choice==3)
			{
				System.out.println("Enter 1st number");
				num1=sc.nextInt();
				System.out.println("Enter 2nd number ");
				num2=sc.nextInt();
				
				ans=division(num1,num2);
				System.out.println("Division is:="+ans);
			}
			else if(choice==4)
			{
				System.out.println("Enter 1st number");
				num1=sc.nextInt();
				System.out.println("Enter 2nd number ");
				num2=sc.nextInt();
				
				ans=multiplication(num1,num2);
				System.out.println("Multiplication is:="+ans);
			}
			else
			{
				System.out.println("invalid input");
			}
			
		}
	sc.close();	
	}
}
