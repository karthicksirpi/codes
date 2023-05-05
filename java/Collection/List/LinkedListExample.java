package com.collection.java;

import java.util.LinkedList;

public class LinkedListExample 

{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		Object x=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		l.addFirst(22);
		l.addLast(100);
		l.add(2);
		System.out.println(l);
		x=l.clone(); // cloning the list l to x
		System.out.println("The value of l"+l+"  "+"The value of x"+x);
		l.clear();
		System.out.println("The value of x after clearing"+l+"  "+x);
		for(int i=0;i<10;i++)
		{
			l.add(i);
		}
		// linkedList is best for deleting elements comapred to ArrayList
		
		System.out.println("The value of l"+l); 
		l.remove(1);
		System.out.println("The value of l after removing "+l);
	}
}
