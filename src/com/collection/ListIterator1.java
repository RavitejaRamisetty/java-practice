package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1
{
	//ListIterator uses only elements of the list classes
	public static void main(String[] args)
	{
		//This is the LinkedList creation
		LinkedList<String> l = new LinkedList<String>();
		l.add("Chiranjeevi");
		l.add("Nagarjuna");
		l.add("BalaKrishna");
		l.add("Venkatesh");
		System.out.println("The linkedlist objects of ListIterator are:" +l);
		l.addFirst("Taraka Ramarao");
		l.add(1,"Nageswararao");
		System.out.println("The updated listiterator objects of linkedlist are:" +l);
		//ListIterator object creation using the LinkedList.here we can use ArrayList also
		ListIterator<String> ltr = l.listIterator();
		while(ltr.hasNext())
		{
	
			System.out.println(ltr.next());
		}
	}

}
