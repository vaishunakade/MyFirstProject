package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Element_Search {
	public static int searchElement(int a[],int num)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int a[]= {5,7,3,9,2};
		Scanner sc=new Scanner(System.in);
		
		System.out.println(Arrays.toString(a));
		System.out.println("Entre the element for serach");
		int num=sc.nextInt();
        
		int c=Element_Search.searchElement(a, num);
		
		if(c>0)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
}
