package javatraining;
abstract class Ab
{
	void m1();
	abstract void add();
}
public class Abstraction1 extends Ab          //abstract class may or maynot contain abstract method
{
	void m1()
	{
		System.out.println("m1 method");
	}
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		Abstraction1 a = new Abstraction1();
		a.m1();
		a.add();
	}
	
}
