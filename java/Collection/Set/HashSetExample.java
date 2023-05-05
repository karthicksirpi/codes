package com.collection.java;

import java.util.HashSet;

public class HashSetExample 
{
	public static void main(String[] args)
	{
		HashSet<Integer> h= new HashSet<Integer>();
		for(int i=0;i<10;i++)
		{
			h.add(i);
		}
		
		System.out.println(h);
		// Set dont allow duplicates
		h.add(2);
		System.out.println(h);
		// It will  not how we sent data it will come by some hashing inbuilt function
		h.add(10);
		h.add(20);
		System.out.println(h);
		
	}
}
