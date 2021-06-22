package com.calculator;
class Factorial
{
	int n1;
	int n2;
	Factorial(int n)
	{
		n1=n;
	}
	Factorial(Factorial f)
	{
		n1=f.n1;
		
	}
	int factorial()
	{
		int i,fact=1;
		for(i=n1;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class practice 
{

	public static void main(String[] args) 
	{
		Factorial f1 = new Factorial(5);
		Factorial f2 = new Factorial(f1); 
		System.out.println(f1.factorial());
		System.out.println(f2.factorial());
	}

}
