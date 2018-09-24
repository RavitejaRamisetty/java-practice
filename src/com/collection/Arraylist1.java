package com.collection;

import java.util.ArrayList;

public class Arraylist1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println("initial arraylist is:" +l);
		l.remove(1);
		l.set(1, 50);
		System.out.println("arraylist after the remove & set operations is:" +l);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(5);
		l1.add(15);
		l1.add(25);
		l1.add(35);
		System.out.println("new arralisy l1 is:" +l1);
		l.addAll(l1);
		System.out.println("arraylist after adding the new arraylist to initial arraylist is:" +l);
		l.addAll(2,l1);
		System.out.println("arraylist after adding the new arraylist to initial arraylist from specified index is:" +l);
	}

}
