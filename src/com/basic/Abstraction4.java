package com.basic;
abstract class Abstra
{
	Abstra()
	{
		System.out.println(" inside the abstract class instance & static blocks are allowed ");
	}
	{
		System.out.println("this is the instance block");
	}
	static
	{
		System.out.println("this is the static block");
	}
}
public class Abstraction4 extends Abstra
{
	public static void main(String[] args)
	{
	Abstraction4 a = new Abstraction4();
	}
}
