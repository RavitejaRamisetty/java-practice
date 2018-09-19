package com.basic;

public class Fib
{
	public static void main(String[] args)
	{
		int i,n,a,b;
		n=5;
		a=0;
		b=1;
		for(i=0;i<n;i++)
		{
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
		}
	}

}
