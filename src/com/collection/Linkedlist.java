package com.collection;

import java.util.LinkedList;

public class Linkedlist
{
	public static void main(String[] args)
	{
		LinkedList<Object> l = new LinkedList<Object>();
		l.add(10);
		l.add("Linkedlist");
		l.add(20);
		l.add("Linkedlist");
		System.out.println("initial linkedlist objects are:" +l);
		l.remove(2);
		l.set(1,50);
		System.out.println("linkedlist objects after performing remove & set operations are:" +l);
		System.out.println("Size of the linkedlist is " +l.size());
		
	}

}
