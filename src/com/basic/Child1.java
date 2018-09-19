package com.basic;
class Par
{
	 Par()
     {
          System.out.println("parent class 0-arg cons");
     }
}
public class Child1 extends Par
{
	Child1()
    {
       this(10);  
         System.out.println("child class 0-arg cons");    
    }
    Child1(int a)
    {
         super();
         System.out.println("child class 1-arg cons");
    }
    public static void main(String[] args)
    {
         new Child1();
    }

}

