package com.calculator;

import java.util.Scanner;

class Area1
{
	double pi=3.14; 
	double areaofcircle(double r)
	{
		return(pi*r*r);
	}
	double areaoftringle(double h,double b)
	{
		return(0.5*h*b);
	}
	double areaofsquare(double l)
	{
		return(l*l);
	}
	double areaofrectangle(double w,double l)
	{
		return(w*l);
	}
}
public class Area 
{
	public static void main(String args[])
	{
		Area1 a=new Area1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:=");
		System.out.println("1.Area of Circle");
		System.out.println("2.Area of Tringle");
		System.out.println("3.Area of Square");
		System.out.println("4.Area of Rectangle");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter Radius Value ");
				double r=sc.nextDouble();
				System.out.println("Area of Circle is:="+a.areaofcircle(r));
				break;
			case 2:
				System.out.println("Enter Hight:= ");
				double h=sc.nextDouble();
				System.out.println("Enter Base Value:=");
				double b=sc.nextDouble();
				System.out.println("Area of Tringle is:="+a.areaoftringle(h, b));
				break;
			case 3:
				System.out.println("Enter length value:=");
				double l=sc.nextDouble();
				System.out.println("Area of Square is:="+a.areaofsquare(l));
				break;
			case 4:
				System.out.println("Enter Length value:=");
				double len=sc.nextDouble();
				System.out.println("Enter width value:=");
				double w=sc.nextDouble();
				System.out.println("Area of Rectangle is:="+a.areaofrectangle(w, len));
				break;
			default:
				System.out.println("invalid operation");
				
				
		}
		
		
	}
}
