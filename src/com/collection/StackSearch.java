package com.collection;

import java.util.Stack;

public class StackSearch
{
	public static void main(String[] args)
	{
		Stack<Object> s = new Stack<Object>();
		s.push(10);
		s.push("A");
		s.push(20);                                //push() inserts the elements into the stack
		s.push("B");
		s.push(30);
		s.push("C");
		System.out.println("The stack is: " +s);  //search() searches the specified object in the stack if present returns offset otherwise returns -1
	    System.out.println("The specified element D is : " +s.search("D"));
	    System.out.println("The specified element A is : " +s.search("A"));
	    System.out.println("The specified element 1 is : " +s.search(1));
	}

}
