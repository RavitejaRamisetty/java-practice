package com.basic;
class P
{
     P()
     {
          System.out.println("parent class 0-arg cons");
     }
}

public class Child3 extends P
{
	Child3()
    {
         System.out.println("child class 0-arg cons");    
    }
    public static void main(String[] args)
    {
         new Child3();
    }

}
