package com.basic;
import java.util.Arrays;
import java.util.*;
public class Arr
{
	public static boolean have(int[] a,int target)
	{
		for(int n:a)
		{
			if(target == n)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public static void main(String[] args)
	{
		int[] array = {10,20,22,33,54,45};
		System.out.println(have(array,20));
		System.out.println(have(array,35));
	}

}
