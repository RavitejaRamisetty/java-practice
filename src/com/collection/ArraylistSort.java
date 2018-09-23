package com.collection;
import java.util.*;
import java.util.ArrayList;

public class ArraylistSort
{
	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<String>();
		l.add("India");
		l.add("China");
		l.add("Afganisthan");
		l.add("Africa");
		l.add("Germany");
		l.add("USA");
		System.out.println("before sorting the string objects in the array list are:");
		System.out.println(l);
		Collections.sort(l);
		System.out.println("after sorting the string objects in the array list are:");
		System.out.println(l);
	}

}
