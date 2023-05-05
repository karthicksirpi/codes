package com.task;


abstract class Check
{
	abstract void multi(int x,int y);
	void modulo(int x,int y)
	{
		int c=x%y;
		System.out.println("The remainder of x modulo y is "+c);
	}
}
 public class Abstra extends Check
{
	
	@Override
	void multi(int x, int y) {
		// TODO Auto-generated method stub
		int c=x*y;
		System.out.println("the product od "+x +" and "+y+"is"+c);
		
	}
	public static void main(String[] args) 
	{
		Abstra a= new Abstra();
		a.modulo(3, 2);
		a.multi(2, 3);
	}


}
