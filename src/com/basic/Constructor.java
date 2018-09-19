package com.basic;

public class Constructor
{
	void a()
	{
		System.out.println("method a");
	}
	Constructor()                                         //default constructor
	{
		System.out.println("0-arg constructor");
	}
	Constructor(int i)                                    //user defined constructor
	{
		System.out.println("1-arg constructor");
	}
	public static void main(String[] args)
	{
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(10);
		c.a();
		c1.a();
	}

}
