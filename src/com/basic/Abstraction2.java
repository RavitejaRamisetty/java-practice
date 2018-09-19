package com.basic;
abstract class Abst
{
	int a=100;
	int b=200;
	abstract void sub();
	void sub1();
}
public class Abstraction2 extends Abst    //variables present inside the abstract class need not to be public,static&final
{
	void sub()
	{
		System.out.println(b-a);
	}
	void sub1()
	{
		System.out.println(a-b);
	}
	public static void main(String[] args)
	{
		Abstraction2 a = new Abstraction2();
		a.sub();
		a.sub1();
	}
}
