package com.collection;

import java.util.Vector;

public class VectorGetObjects
{
	public static void main(String[] args)
	{
		Vector<Object> v = new Vector<Object>();
		v.addElement("A");
		v.addElement(1);
		v.addElement("B");
		v.addElement(2);
		System.out.println("The vector is: " +v);
		//getting the first element
		System.out.println("The first element in the vector is: " +v.firstElement());
		//get the element at specified index
		System.out.println("The element at the specified index in the vector is: " +v.elementAt(2));
		//get the last element in the vector
		System.out.println("The last element in the vector is: " +v.lastElement());
	}


}
