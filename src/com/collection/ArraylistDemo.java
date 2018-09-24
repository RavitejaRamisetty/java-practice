package com.collection;

import java.util.ArrayList;

public class ArraylistDemo
{
	public static void main(String[] args)
	{
		ArrayList<Object> l = new ArrayList<Object>();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		l.add(3,"X");
		l.add("Y");
		System.out.println(l);
		
		
	}

}
