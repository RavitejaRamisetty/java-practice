package javatraining;

import java.util.Scanner;

public class Findingelement
{
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5};int target;
		System.out.println("enter target element");
		Scanner s = new Scanner(System.in);
		target = s.nextInt();
	    int i;
		
			for(i=0;i<a.length;i++)
			{
				
				if(target==a[i])
				{
			        System.out.println(target+"found");
			    }
			
				if(target==a.length)
				{
					System.out.println(target+"not found");
			
				}
			}	
		}
	}
