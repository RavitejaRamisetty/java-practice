package com.basic;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		int i,j,a,b;
		j=10;
		a=0;
		b=1;
		for(i=0;i<=j;i++)
		{
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
		}
	}

}