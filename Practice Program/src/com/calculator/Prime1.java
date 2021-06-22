package com.calculator;

import java.util.Scanner;

public class Prime1 
{
	public static void main(String args[])
	{
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choice:-");
		System.out.println("1. For Checking through Range");
		System.out.println("2. For Checking Prime number");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter Range for checking Prime Number");
				int num=sc.nextInt();
				int c=0;
				int i=0;
				int j=0;
				for(i=1;i<=num;i++)
				{
					for(j=1;j<=i;j++)
					{
						if(i%j==0)
						{
							c=c+1;
						}
					}
					if(c==2)
					{
						System.out.println(i);
					}
					
					c=0;
				}
				break;
			case 2:
				int c1=0;
				System.out.println("Enter Number for checking prime number");
				int num1=sc.nextInt();
				for(i=1;i<=num1;i++)
				{
					if(num1%i==0)
					{
						c1=c1+1;
					}
				}
				if(c1==2)
				{
					System.out.println(num1+"Number is Prime");
				}
				else
				{
					System.out.println(num1+"Number is not Prime");
				}

				break;
			
		}
		sc.close();
				
		
	}
	
				
	}

