package com.collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSet1
{
	public static void main(String[] args)
	{
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		lh.add(1);
		lh.add(2);
		lh.add(3);
		lh.add(4);
		lh.add(5);
		lh.add(null);
		lh.add(1);
		lh.add(null);
		System.out.println("The linked hashset is:" +lh);
		System.out.println("The linkedhashset contains 4:" +lh.contains(4));
		System.out.println("The linkedhashset contains 6:" +lh.contains(6));
		System.out.println("The linkedhashset is:" +lh.isEmpty());
		LinkedHashSet<Integer> lh1 = new LinkedHashSet<Integer>();
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println("The linkedlist is:" +l);
		lh.addAll(l);
		System.out.println("The linkedhashset with linkedlist collection object is:" +lh);
		lh1 = (LinkedHashSet<Integer>)lh.clone();
		System.out.println("The cloned linkedhashset is:" +lh1);
		System.out.println("The size of the linkedhashset is:" +lh.size());
		lh.removeAll(lh);
		System.out.println("The linkedhashset after using removeall() method is:" +lh);
		lh.add(1);
		lh.add(2);
		lh.add(3);
		lh.add(4);
		lh.add(5);
		lh.add(null);
		lh.retainAll(lh);
		System.out.println("The linkedhashset after using the retainAll() method is:" +lh);
	}

}
