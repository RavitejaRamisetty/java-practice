package com.collection;

import java.util.Stack;

public class StackPeek
{
	public static void main(String[] args)
	{
		Stack<Object> s = new Stack<Object>();
		s.push(1);
		s.push("A");
		s.push(2);                                //push() inserts the elements into the stack
		s.push("B");
		s.push(3);
		s.push("C");
		s.push(4);
		s.push("D");
		s.push(5);
		s.push("E");
		s.push(6);
		s.push("F");
		System.out.println("The stack is: " +s);
		s.peek();                                   //peek() returns the top of the stack without removal
		System.out.println("The stack after applying the peek method is: " +s);
	}
	
	

}
