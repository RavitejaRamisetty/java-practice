package com.basic;
abstract class Abstr
{
	int a;
	int b;
	void display();
}
public class Abstraction3 extends Abstr     //in abstract class variables can be intialized before the declaration
{
	void display()
	{
		a=10;
		b=30;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		Abstraction3 a = new Abstraction3();
		a.display();
	}

}
