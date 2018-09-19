package com.basic;

public class Userdefinedcons
{
	void a()
	{
		System.out.println("method a");
	}
	Userdefinedcons(int i)
	{
		System.out.println("1-arg constructor");
	}
	public static void main(String[] args)
	{
		Userdefinedcons u = new Userdefinedcons(10);
		u.a();
	}

}
