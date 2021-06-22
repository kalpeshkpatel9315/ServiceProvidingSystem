package com.calculator;
import java.util.*;
public class Fact 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int no=sc.nextInt();
		int ans=1;
		for(int i=no;i>=1;i--)
		{
			ans=ans*i;
		}
		System.out.println("factorial of"+no+"is:-"+ans);
		sc.close();
	}

}
