package com.collection;

import java.util.LinkedList;

public class Linkedlist2
{
	public static void main(String[] args) throws Exception
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println("The linkedlist is" +l);
		//checks whether the list contains specified elements are not
		System.out.println(l.contains(5));
		System.out.println(l.contains(4));
		//to get the first & last indexes in the linkedlist
		System.out.println("The first object in the linkedlist contains: " +l.getFirst());
		System.out.println("The last object in the linkedlist contains: " +l.getLast());
		//to get what the elements in the specified index contains
		System.out.println("The first index in the linkedlist contains: " +l.indexOf(1));
		System.out.println("The second index in the linkedlist contains: " +l.indexOf(2));
		System.out.println("The third index in the linkedlist contains: " +l.indexOf(3));
		System.out.println("The zero index in the linkedlist contains: " +l.indexOf(0));
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1=(LinkedList<Integer>)l.clone();
		System.out.println("The linkedlist after using clone method is: " +l1);
		//to clear the linkedlist
		l.clear();
		System.out.println("The linkedlist after using clear method is: " +l);
	}

}
