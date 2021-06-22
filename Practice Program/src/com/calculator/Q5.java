package com.calculator;
class table
{
	synchronized void p(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}
class th1 extends Thread
{
	table ta;
	th1(table ta)
	{
		this.ta=ta;
	}
	public void run()
	{
		ta.p(10);
	}
}
class th2 extends Thread
{
	table ta;
	th2(table ta)
	{
		this.ta=ta;
	}
	public void run()
	{
		ta.p(20);
	}
}
class Q5
{
	public static void main(String args[])
	{
		table t=new table();
		th1 t1=new th1(t);
		th2 t2=new th2(t);
		t1.start();
		t2.start();
	}
}