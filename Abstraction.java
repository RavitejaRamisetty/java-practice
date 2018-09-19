package javatraining;
abstract class Abs
{
	abstract void m1();
}
public class Abstraction extends Abs          //sample program for abstract class
{
	void m1()
	{
		System.out.println("m1 method");
	}
	public static void main(String[] args)
	{
		Abstraction a = new Abstraction();
		a.m1();
	}

}
