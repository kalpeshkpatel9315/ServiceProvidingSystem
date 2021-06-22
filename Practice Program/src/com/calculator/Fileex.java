package com.calculator;

import java.util.Scanner;

public class Fileex {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i=0,j=0,temp=0;
		a[0]=10;
		a[1]=3;
		a[2]=45;
		a[3]=45;
		a[4]=4;
		a[5]=5;
		a[6]=44;
		a[7]=45;
		a[8]=21;
		a[9]=34;
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0;i<10;i++)
		{
			for(j=i;j<10;j++)
			{
				if(a[j]<a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
		/*
		 * System.out.println("enter number"); int no=sc.nextInt(); int flag=0; int
		 * flag1=0; int i=0; for(i=0;i<10;i++) { if(no==a[i]) { flag++; }
		 * 
		 * 
		 * } if(flag>0) { System.out.println(flag+" time number is found "); } else {
		 * System.out.println("not found"); }
		 */		
		

	}

}
