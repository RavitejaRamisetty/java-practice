package javatraining;

public class Instancevar
{
	int a=100;                                 //instance variables are declared inside the class outside the method
	int b=150;
	public static void main(String[] args)    //values are printed by creating object
	{
		Instancevar i = new Instancevar();          
		System.out.println(i.a);
		System.out.println(i.b);
		System.out.println(i.a+i.b);
	}

}
