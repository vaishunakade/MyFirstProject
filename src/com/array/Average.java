package com.array;

import java.util.Scanner;

public class Average {
	static double averageCalculate(int a[], int n)
    {
     
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum +  a[i];
        }
        
        return (double)sum / n;
    }
     
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        
        int n;  
        System.out.println("Enter the elements in the array ");
        n=sc.nextInt(); 
        
        int a[] = new int[n];
        System.out.println("Enter the array elements ");
        
        for(int i=0;i<n;i++)      
        {
            a[i]=sc.nextInt();
        }
     
        System.out.println(" Average of element of array "+averageCalculate(a, n)); 
        
 
      }

}
