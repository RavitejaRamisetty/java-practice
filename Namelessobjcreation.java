package javatraining;

public class Namelessobjcreation
{
	  Namelessobjcreation()
	    {
	        this(10);
	        System.out.println("0-arg cons");
	    }
	    Namelessobjcreation(int a)
	    {
	        this(10,20);
	        System.out.println("1-arg cons");
	    }
	    Namelessobjcreation(int a,int b)
	    {
	        System.out.println("2-arg cons");
	    }
	    public static void main(String[] args)
	    {
	        new Namelessobjcreation();  
	    }

}
