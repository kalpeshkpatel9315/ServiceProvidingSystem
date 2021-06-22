package com.calculator;

public class Interest {

	public static void main(String[] args)
	{
		double p=100f,r=2f,n=10f,ans=1;
		ans=p*Math.pow(1+r/100, n)-p;
		
		
		System.out.println("Compound interest is:="+ans);
		
		

	}

}
