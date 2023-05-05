package com.collection.java;

import java.util.LinkedHashSet;

public class LinkedHashSetEx 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
		for(int i=1;i<=10;i++)
		{
			h.add(i);
		}
		
		System.out.println(h);
		// Set dont allow duplicates
		h.add(2);
		System.out.println(h);
		// It will come in insertion order
		h.add(50);
		System.out.println(h.size()); // check the size
		h.add(10);
		h.add(20);
		System.out.println(h);
		 // it will remove the element 10 not 
		// not remove the 10th position 		
		h.remove(10);
		System.out.println("After reemoving"+h);
	}
	
	
	
}
