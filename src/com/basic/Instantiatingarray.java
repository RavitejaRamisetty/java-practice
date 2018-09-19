package com.basic;

public class Instantiatingarray
{
	public static void main(String[] args)         //instantiating an array
	{
		int a[] = new int[5];                      //by giving size of array it will have default value of 0
		for(int A:a)
		{
			System.out.println(A);
			
		}
		float b[] = new float[3];
		b[0]=20;
		b[1]=30;
		b[2]=40;
		for(float B:b)
		{
			System.out.println(B);
		}
	}

}