package javatraining;
import java.util.Date;
public class Displaydate
{
	public static void main(String[] args)
	{
		Date date=new Date();
		System.out.println(date.getTime());        //getTime() method:gives the time in milliseconds
		System.out.println(date.toString());       //toString() method:gives the current date & time
	}

}
