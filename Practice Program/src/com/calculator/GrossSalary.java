package com.calculator;

import java.util.Scanner;

public class GrossSalary 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary:=");
		int b_salary=sc.nextInt();
		System.out.println("Enter Dearness Allowance:=");
		int da=sc.nextInt();
		System.out.println("Enter House rent Allowance:=");
		int hra=sc.nextInt();
		int total_sal=b_salary+da+hra;
		System.out.println("Total Salary:="+total_sal);
		
	}
	
}
