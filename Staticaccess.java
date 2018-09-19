package javatraining;

public class Staticaccess
{
	static int a=20;
	public static void main(String[] args)
	{
		System.out.println(Staticaccess.a);    //static variable access by using class name
		System.out.println(a);                //static variable access directly
		Staticaccess s = new Staticaccess(); //static variable access by using object
		System.out.println(s.a);
	}

}
