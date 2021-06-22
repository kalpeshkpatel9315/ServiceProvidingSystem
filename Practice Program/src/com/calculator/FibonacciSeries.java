package com.calculator;
import java.util.*;
public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t1=0,t2=1,temp=0;
		System.out.println("enter number:=");
		int no=sc.nextInt();
		System.out.println(t1);
		System.out.println(t2);
		for(int i=1;i<no-1;i++)
		{
			temp=t1+t2;
			System.out.println(temp);
			t1=t2;
			t2=temp;
			
		}
		
		
	}

}
