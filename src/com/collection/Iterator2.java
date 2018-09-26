package com.collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Iterator2
{
	//In Iterator cursor any type of collection is used 
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(15);
		ll.add(20);
		ll.add(20);
		ll.add(25);
		System.out.println("The linkedlist Iterator objects are:" +ll);
		ll.addFirst(5);
		ll.addLast(30);
		System.out.println("The linkedlist Iterator objects after adding first & last elements are:" +ll);
		ll.remove(3);
		ll.set(0,3);
		System.out.println("The linkedlist Iterator objects after using remove & set methods are:" +ll);
		System.out.println(ll);
		//Iterator object is created using any type of collection
		Iterator<Integer> itr = ll.iterator();
		
		//Iterator cursor have 3 methods hasNext(),next(),remove()
		while(itr.hasNext())
		{
			Integer i = (Integer)itr.next();
			//here it will prints only integer values in the given linkedlist
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				//by using remove() method in Iterator it removes permanently
				itr.remove();
			}
		}
		System.out.println(ll);
	}

}


/*
output:
+
The linkedlist Iterator objects are:[10, 15, 20, 20, 25]
The linkedlist Iterator objects after adding first & last elements are:[5, 10, 15, 20, 20, 25, 30]
The linkedlist Iterator objects after using remove & set methods are:[3, 10, 15, 20, 25, 30]
[3, 10, 15, 20, 25, 30]
10
20
30
[10, 20, 30]
*/