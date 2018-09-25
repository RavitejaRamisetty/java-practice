package com.collection;
import java.util.Stack;
public class StackPop
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
		s.pop();                                   //pop() removes the top of the stack & returns the stack
		System.out.println("The stack after applying the pop method is: " +s);
		s.pop();
		System.out.println("The stack after applying the pop method is: " +s);
		s.pop();
		System.out.println("The stack after applying the pop method is: " +s);
		s.pop();
		System.out.println("The stack after applying the pop method is: " +s);
		s.pop();
		System.out.println("The stack after applying the pop method is: " +s);
		s.pop();
		System.out.println("The stack after applying the pop method is: " +s);
	}

}
