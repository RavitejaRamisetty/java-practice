package com.basic;
import java.util.Scanner;
public class Evenodd 
{
	public static void main(String[] args)
	{
		int a;
		System.out.println("give the value of a");
		Scanner S = new Scanner(System.in);
		a=S.nextInt();
		if(a%2==0)
		{
			System.out.println(a+ "is even number");
		}
		else
		{
			System.out.println(a+ "is odd number");
		}
		
		
		
	}

}
