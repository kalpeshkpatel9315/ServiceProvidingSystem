package com.calculator;

import java.util.Scanner;

public class MaxNumber 
{

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:=");
		int no1=sc.nextInt();
		System.out.println("Enter number 2:=");
		int no2=sc.nextInt();
		System.out.println("Enter number 3:=");
		int no3=sc.nextInt();
		
		if(no1>no2 && no1>no3)
		{
			System.out.println(no1+"is greater");
		}
		else if(no2>no1 && no2>no3)
		{
			System.out.println(no2+"is greater");
		}
		else
		{
			System.out.println(no3+"is greater"); 
			
		}
	}

}
