package com.basic;
class X{}
class Y{}
class Student{}
public class Method3
{
	 void m1(X x)
     {
         System.out.println("m1 method");
     }
     static void m2(Y y,Student s)
     {
         System.out.println("m2 method");
     }
     public static void main(String[] args)
     {
         Method3 m = new Method3();
         X x = new X();            
         m.m1(x);
         Y y = new Y();
         Student s = new Student();     
         Method3.m2(y,s);
     }

}
