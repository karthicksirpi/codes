package com.collection.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample 
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();
		m.put(1,"charan");
		m.put(2,"karthick");
		m.put(3, "Senthil");
		m.put(10,"hemthath");
		m.put(11,"Aruna");
		m.put(4, "praveen");
		System.out.println("The map is "+m);// it will follow insertion order
		System.out.println(m.get(2)); // by using key we can get the value of key
	}
	
}