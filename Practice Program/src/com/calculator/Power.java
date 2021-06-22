package com.calculator;
import java.util.*;
public class Power {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int no=sc.nextInt();
		System.out.println("Enter power");
		int power=sc.nextInt();
		int ans=1;
		for(int i=1;i<=power;i++)
		{
			ans=ans*no;
		}
		System.out.println("power of"+no+"is:-"+ans);

	}

}
