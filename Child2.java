package javatraining;
class Parent
{
     void m1()
     {
          System.out.println("parent class m1 method");
     }
}
public class Child2 extends Parent
{
	void m1()
    {
         System.out.println("child class m1 method");
    }
    void m2()
    {
    	m1();
        super.m1();
    }
    public static void main(String[] args)
    {
         new Child2().m2();
    }

}
