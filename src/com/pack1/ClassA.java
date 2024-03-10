package com.pack1;

import java.util.Optional;

public class ClassA 
{
	void meth1() 
	{
		String arr[] = new String[5];
		arr[1] = "Kishan";
		arr[2] = "Java";
		
//		System.out.println(arr[0].toLowerCase());
		
		Optional<String> o = Optional.ofNullable(arr[1]);
		System.out.println(o);
		
		if(o.isPresent())
		{
			System.out.println("Data is present");
			System.out.println(o.get());
		}
		else
			System.out.println("Its empty");
	}
	public static void main(String[] args) 
	{
		new ClassA().meth1();
	}
}
