package com.calculator;

import java.util.Scanner;

public class Stringpractice 
{
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stirng:=");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		
		System.out.println(sb.reverse());
		//char ch[]=new char[s.length()];
		//ch[1]=s.charAt(1);
		//System.out.println(ch);
		/*
		 * for(int i=0;i<s.length();i++) { ch[i]=s.charAt(i); } for(char c:ch) {
		 * System.out.println(c); }
		 */
		
    }
}
