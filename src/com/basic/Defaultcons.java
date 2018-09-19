package com.basic;

public class Defaultcons
{
	void a()
	{
		System.out.println("method a");
	}
	Defaultcons()
	{
		System.out.println("0-arg constructor");
	}
	public static void main(String[] args)
	{
		Defaultcons d = new Defaultcons();
		d.a();
	}

}
