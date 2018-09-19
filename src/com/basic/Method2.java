package com.basic;

public class Method2
{
	void m1(int a,char ch)
    {
        System.out.println("m1 method");
        System.out.println(a);
        System.out.println(ch);
    }
    static void m2(String str,double d)
    {
        System.out.println("m2 method");
        System.out.println(str);
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        Method2 m = new Method2();
        m.m1(10,'a');
        Method2.m2("abcd",10.5);
    }

}
