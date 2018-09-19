package com.basic;
import java.util.Scanner;
public class Array_sum
{
	public static void main(String[] args) 
	{
		int[] a=new int[20];
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		System.out.println("enter sum");
		int m=s.nextInt();
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
				if(a[i]+a[j]+a[k]==m)
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
				}
			}
		}
	}


}
