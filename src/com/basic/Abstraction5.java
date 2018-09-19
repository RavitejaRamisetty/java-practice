package com.basic;
abstract class Abstrac
{
	Abstrac()
	{
		System.out.println("0-arg constructor");   
	}	
}
public class Abstraction5 extends Abstrac
{
	public static void main(String[] args)
	{
		Abstraction5 a = new Abstraction5();
	}
}
