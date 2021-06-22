package com.calculator;
import java.util.*;
public class SumofDigit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:=");
		int no=sc.nextInt();
		int rem,rev=0;
		while(no!=0)
		{
			rem=no%10;
			rev=rev+rem;
			no=no/10;
		}
		System.out.println("sum of digit"+rev);

	}

}
