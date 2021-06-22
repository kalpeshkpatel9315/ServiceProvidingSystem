package com.calculator;
class add implements Runnable
{
	public void run()
	{
		try
		{
			String a="kalpesh";
			
			System.out.println("length:="+a.length());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class sub implements Runnable
{
	public void run()
	{
		try
		{
			String b="KALPESH";
			System.out.println("character:="+b);
			System.out.println("index:="+b.indexOf(b));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}

public class threadex 
{
	public static void main(String args[])
	{
		add a=new add();
		Thread t=new Thread(a);
		t.start();
		sub s=new sub(); 
		Thread t1=new Thread(s); 
		t1.start();
	}
}
