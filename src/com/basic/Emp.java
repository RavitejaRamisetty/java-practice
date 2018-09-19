package com.basic;

public class Emp
{
	 int eid;
	   String ename;
	   float esal;
	   Emp(int eid,String ename,float esal)
	   {
	       this.eid = eid;
	       this.ename = ename;
	       this.esal = esal;     
	   }
	   void display()
	   {
	      System.out.println("employee id=" +eid);
	      System.out.println("employee name=" +ename);
	      System.out.println("employee salary=" +esal);
	   }
	   public static void main(String[] args)
	   {
	      Emp e1 = new Emp(123,"Teja",10000f);
	      e1.display();
	      Emp e2 = new Emp(456,"Ram",20000f);
	      e2.display();
	   }

}
