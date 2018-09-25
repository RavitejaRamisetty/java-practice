package com.collection;

import java.util.Vector;

public class VectorRemovingObjects 
{
	public static void main(String[] args)
	{
		Vector<Object> v = new Vector<Object>();
		v.addElement("A");
		v.addElement(1);
		v.addElement("B");
		v.addElement(2);
		System.out.println("The vector is: " +v);
		v.removeElement(1);                          //removing directly element
		System.out.println("The vector after removing specified element is: " +v);
		v.removeElementAt(0);                        //removing element by using index
		System.out.println("The vector after removing specified index element is: " +v);
		v.removeAllElements();
		System.out.println("The vector after removing all the elements is: " +v);
	}

}
