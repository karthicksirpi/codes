package com.collection.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class LinkedHashMapExample
{
	public static void main(String[] args) 
	{
		//linked  hash map follows the Insertion order
			LinkedHashMap m = new LinkedHashMap();
			m.put(1,"charan");
			m.put(2,"karthick");
			m.put(3, "Senthil");
			m.put(10,"hemthath");
			m.put(11,"Aruna");
			m.put(4, "praveen");
			System.out.println("The map is "+m);
			System.out.println(m.get(2)); // by using key we can get the value of key
		
	}
	
}
