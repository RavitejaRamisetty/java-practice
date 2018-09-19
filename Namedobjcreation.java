package javatraining;

public class Namedobjcreation
{  
	Namedobjcreation()
    {
    this(10);
    System.out.println("0-arg cons");

    }

	Namedobjcreation(int a)
   {
    this(10,20);
    System.out.println("1-arg cons");
   }
	
    Namedobjcreation(int a,int b)
    {
    
    	System.out.println("2-arg cons");
    }
    public static void main(String[] args)
    {
    	
       Namedobjcreation n = new Namedobjcreation();  
    }

}
