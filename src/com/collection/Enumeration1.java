package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1
//This Enumeration cursor is used to obtain the objects one by one
{
	public static void main(String[] args)
	{
		
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0;i<10;i++)
		{
			v.addElement(i);
		}
		System.out.println("The enumerated vector objects are:" +v);
		//Enumeration object is created by using elements() method of vector class
		Enumeration<Integer> e = v.elements();
		//In Enumeration cursor there are only two methods "hasMoreElements(),nextElement()
		while(e.hasMoreElements())
		{
			Integer i = (Integer) e.nextElement();
			//here only even numbers are printed & remaining will not
			if(i%2==0)
			{
				System.out.println(i);
			}	
		}
		System.out.println(v);
		
	}

}

/*output
The enumerated vector objects are:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
0
2
4
6
8
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/

