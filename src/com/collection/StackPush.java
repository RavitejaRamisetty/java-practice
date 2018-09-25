package com.collection;
import java.util.Stack;
public class StackPush
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
			System.out.println("The stack is: " +s);
		}

}
