package com.cg.iter.test3;
import java.util.*;  
public class SecondSmall
{  
	public static int getSecondSmallest(Integer[] a, int total)
	{  
		List<Integer> list=new ArrayList<>();  
		for (Integer added : a) 
		{
			list.add(added);  //adding from array to list
		}
		Collections.sort(list);  
		int element=list.get(1);  
		return element;  
	}  
	public static void main(String args[])
	{   
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		int n=sc.nextInt();
		Integer b[]=new Integer[n]; 
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Second Smallest: "+getSecondSmallest(b,n));  
	}
}  