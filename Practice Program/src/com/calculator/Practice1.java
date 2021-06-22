package com.calculator;

import java.util.Scanner;

class Practice1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double sum=0;
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+(double)1/(2*i-1);
			
		}
		System.out.println("sum of series is:="+sum);
		
	}
}