package com.collection;

import java.util.LinkedList;

public class Linkedlist1
{
	public static void main(String[] args)
	{
		LinkedList<Object> l = new LinkedList<Object>();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		System.out.println("initial linkedlist objects are:" +l);
		l.remove(2);
		l.set(1,50);
		System.out.println("linkedlist objects after performing remove & set operations are:" +l);
		System.out.println("Size of the linkedlist is " +l.size());
		LinkedList<Object> l1 = new LinkedList<Object>();
		l1.add("Linkedlist");
		l1.add("duplicates allowed");
		l1.add("order preserved");
		l1.addAll(l);
		System.out.println("new linkedlist after adding another linkedlist to initial linkedlist is:" +l1);
		System.out.println("Size of the linkedlist is " +l1.size());
		l1.removeFirst();
		System.out.println("linkedlist after removing first object is " +l1);
		l1.addLast("Linkedlist");
		System.out.println("linkedlist after adding the last object is " +l1);
	}


}
