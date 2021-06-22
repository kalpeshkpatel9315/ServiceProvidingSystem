package com.calculator;

class Practice2
{
	int n;
	Practice2(int no)
	{
		n = no;
	}
	void equation()
	{
		int d=1,steps=1;
		double ans =0;		
		do
		{
			if(steps == 1)
			{}
			else if(steps == 2 || steps == 3)
				d +=3;
			else
				d +=2;
			if(d >= n)
				break;
			ans += (double)1/d;
			steps++;	
			if(steps == 5)
				steps = 2;
		}while(d<n);
		System.out.println(ans);
	}
	public static void main(String args[])
	{
		Practice2 e = new Practice2(2);
		e.equation();
	}
}