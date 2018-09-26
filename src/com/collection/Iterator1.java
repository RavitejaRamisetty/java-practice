package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1
{
	//Iterator cursor uses any type of collection
	public static void main(String[] args)
	{
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add("A");
		al.add(20);
		al.add("B");
		al.add(30);
		al.add("C");
		System.out.println("The Iterator arraylist objects are:" +al);
		al.remove(1);
		al.remove("B");
		System.out.println("The Iterator arraylist objects after removing two elements are:" +al);
		al.add(1,15);
		al.add(3,"D");
		System.out.println("The Iterator arraylist objects after adding elements are:" +al);
		al.set(2, "A");
		System.out.println("The Iterator arraylist objects after performing some operations are:" +al);
		//Iterator object is created using any type of collection
		Iterator<Object> itr = al.iterator();
		
		//Iterator has 3 methods hasNext(),next(),remove()
		while(itr.hasNext())
		{
			Object o = (Object) itr.next();
			System.out.println(o);
		}
		System.out.println(al);
	}

}


/*
output:

The Iterator arraylist objects are:[10, A, 20, B, 30, C]
The Iterator arraylist objects after removing two elements are:[10, 20, 30, C]
The Iterator arraylist objects after adding elements are:[10, 15, 20, D, 30, C]
The Iterator arraylist objects after performing some operations are:[10, 15, A, D, 30, C]
10
15
A
D
30
C
[10, 15, A, D, 30, C]
*/