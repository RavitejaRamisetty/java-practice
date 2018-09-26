package com.collection;
import java.util.Enumeration;
import java.util.Vector;

public class Enumeration2 
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		v.add("Ravi");
		v.add("Teja");
		v.add("Ramisetty");
		v.add("Male");
		v.add("DOB");
		v.add("11-01-1995");
		System.out.println(v);
		//Enumeration object is created by using elements() method of vector class
		Enumeration<String> e = v.elements();
		//Enumeration cursors have only two methods "hasMoreElements(),nextElement()"
		while(e.hasMoreElements())
		{
			String s = (String) e.nextElement();
			System.out.println(s);
		}
	}

}

/*
[Ravi, Teja, Ramisetty, Male, DOB, 11-01-1995]
Ravi
Teja
Ramisetty
Male
DOB
11-01-1995
*/