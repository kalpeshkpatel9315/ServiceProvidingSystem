package com.calculator;
import java.util.*;
public class Armstrong 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:=");
		int no=sc.nextInt();
		int temp=no;
		int rem=0,ans=0;
		while(no!=0)
		{
			rem=no%10;
			ans=ans+(rem*rem*rem);
			no=no/10;
		}
		if(temp==ans)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("not Armstrong");
		}
	}

}
