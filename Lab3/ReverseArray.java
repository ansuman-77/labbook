package com.cg.iter.test3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ReverseArray
{
	
	public static void main(String[] args)
	{
	

		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		int n=sc.nextInt();
		Integer intArray[]=new Integer[n]; 
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			intArray[i]=sc.nextInt();
		}

		String strArray[] = new String[n];

		for (int i = 0; i < n; i++)
			strArray[i] = String.valueOf(intArray[i]);

		System.out.println("The array: "+Arrays.toString(strArray));
		
		System.out.println("Sorted Array: "+getSorted(strArray));
	}

	private static List<String> getSorted(String[] strArray) {
		List<String> list = Arrays.asList(strArray);
		Collections.reverse(list);
		System.out.println("Reverse List: "+list);
		Collections.sort(list);
		return list;
	}
}