package com.task;

import com.task.Inter.Check;

interface Inter 

{
	void print();
	void add(int x,int y);
	void sub(int x,int y);
}


  
  class InerfacePrac  implements Inter
{
	 
	 @Override
	public void print() 
	{
		System.out.println("This method from Main class of interface");
	}
	@Override
	public void sub(int x,int y) {
		int c=x-y;
		System.out.println("The difference between x and y is "+c);
		
	}
	@Override
	public void add(int x,int y) {
		// TODO Auto-generated method stub
		int c =x+y;
		System.out.println("The sum of x and y is "+c);
		
	}
	@Override
	void multi(int x, int y) {
		// TODO Auto-generated method stub
		int c=x*y;
		System.out.println("The product of x and y "+c);
		
	}
	 public static void main(String[] args) 
	 {
		 InerfacePrac m =new InerfacePrac();
		 m.print();
		 m.add(12, 30);
		 m.sub(45, 30);
		 m.multi(2, 10);
		 m.modulo(12, 2);
	}
	
}
