package com.collection;

import java.util.ArrayList;

public class Arraylist
{
	public static void main(String[] args)
	{
		ArrayList ll = new ArrayList();
		ll.add("Ravi");
		ll.add("ram");
		ll.add("raju");
		ll.add("rakesh");
		System.out.println("original array list is:");
	    System.out.println(ll);
		System.out.println(ll);
		ll.remove(2);
		ll.remove(1);
		System.out.println("array list after removing objects");
		System.out.println(ll);
		ll.add(1,"anil");
		ll.add("venkat");
		System.out.println("array list after adding objects");
		System.out.println(ll);
		
	}

}
