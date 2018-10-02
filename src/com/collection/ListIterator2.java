package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println("The arraylist is:" +a);
		ListIterator<Integer> ltr = a.listIterator();
		while(ltr.hasNext())
		{
			Integer i = (Integer) ltr.next();
			System.out.println(i);
		}
		System.out.println(a);
		//hasPrevious() is used to print the values in reverse order.it checks the previous values
		while(ltr.hasPrevious())
		{
			Integer in = (Integer) ltr.previous();
			System.out.println(in);
		}
		System.out.println(a);
	}

}
