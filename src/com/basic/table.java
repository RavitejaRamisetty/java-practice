package com.basic;

import java.util.Scanner;
public class table 
{
	public static void main(String[] args)
	{
		int a,i;
		System.out.println("give the table digit you want");
		Scanner S = new Scanner(System.in);
		a = S.nextInt();
		for(a=1;a<=10;a++)
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(+a+ " x " +i+ "=" +(a*i));
			}
		}
		
	}

}
