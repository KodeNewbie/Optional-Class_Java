package com.pack1;

import java.util.Arrays;

public class ClassB 
{
	void meth1()
	{
		int arr[] = {3,6,1,7,2,8,4,9,5};
		
		System.out.println("Before : " + Arrays.toString(arr));
		
//		Arrays.sort(arr);
		
		Arrays.parallelSort(arr,1,4);
		Arrays.parallelSort(arr,5,8);
		
		System.out.println("After : "+ Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassB().meth1();
	}

}
