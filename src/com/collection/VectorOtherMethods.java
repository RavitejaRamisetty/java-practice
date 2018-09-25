package com.collection;
import java.util.Vector;
public class VectorOtherMethods
{
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<Integer>();
		for(int j=0;j<10;j++)
		{
			v.addElement(j);
		}
		System.out.println("The vector is: " +v);
		//to get the capacity of the vector
	    System.out.println("The capacity of the vector is: " +v.capacity());
		//to get the size of the vector
		System.out.println("The size of the vector is: " +v.size());
		for(int i=0;i<=15;i++)
		{
			v.addElement(i);
		}
		System.out.println("The vector is: " +v);
		//to get the capacity of the vector
		System.out.println("The capacity of the vector is: " +v.capacity());
		//to get the size of the vector
		System.out.println("The size of the vector is: " +v.size());
	}
	

}
