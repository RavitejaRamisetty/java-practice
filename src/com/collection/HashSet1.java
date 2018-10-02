package com.collection;
import java.util.ArrayList;
import java.util.HashSet;
public class HashSet1
{
	public static void main(String[] args)
	{
		//in hashset the initial capacity is 16 & the initial fill ratio is 0.75
		//fill ration 0.75 means if 75% of the hashset capacity is filled automatically new hashset is created
		HashSet<Integer> h = new HashSet<Integer>(17);
		//adding the elements to the hashset
		//in hashset there are no special methods the methods used in the collection are used as the hashset methods
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(3);
		h.add(4);
		h.add(5);
		/*
		 in hashset duplicates are not allowed if we add the duplicates it doesn't give 
		 any type of errors but simply it rejects the duplicates in the output
		 
		 */
		System.out.println("The HashSet is:" +h);
		//in hashset null values are posible
		h.add(null);
		h.add(6);
		h.add(7);
		h.add(8);
		h.add(9);
		h.add(2);
		//in hashset insertion is not preserved but the insertion depends on hash code
		System.out.println("The updated hashset is:" +h);
		h.remove(4);
		System.out.println("The updated hashset after remove operation is:" +h);
		System.out.println("The size of the hashset is " +h.size());
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("The arraylist is:" +al);
		/*
		  hashset with another collection is also possible.here we used the addAll() method
		  to create the hashset with arraylist objects
		 */
		h.addAll(al);
		System.out.println("The hashset from arraylist is"+h);
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1=(HashSet<Integer>)h.clone();
		//in hashset we can also use the clone method by creating a new hashset
		System.out.println("The cloned hashset is" +h1);
		//by using the size() method we can get the capacity of the hashset
		System.out.println("The size of the hashset is:" +h.size());
	}
}


/*

output:

The HashSet is:[1, 2, 3, 4, 5]
The updated hashset is:[null, 1, 2, 3, 4, 5, 6, 7, 8, 9]
The updated hashset after remove operation is:[null, 1, 2, 3, 5, 6, 7, 8, 9]
The size of the hashset is 9
The arraylist is:[10, 20, 30, 40]
The hashset from arraylist is[null, 1, 2, 3, 5, 6, 7, 8, 40, 9, 10, 20, 30]
The cloned hashset is[null, 1, 2, 3, 5, 6, 7, 8, 40, 9, 10, 20, 30]
The size of the hashset is:13

*/