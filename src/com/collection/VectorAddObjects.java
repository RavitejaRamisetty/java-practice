package com.collection;
import java.util.Vector;
public class VectorAddObjects
{
	public static void main(String[] args)
	{
		Vector<Object> v = new Vector<Object>();
		v.addElement("A");
		v.addElement(1);
		v.addElement("B");
		v.addElement(2);
		System.out.println("The vector is: " +v);
	}

}
