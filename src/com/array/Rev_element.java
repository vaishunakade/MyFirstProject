package com.array;

import java.util.Arrays;

//5.WAP to print reverse of an array. Also print every alternate element backwards.
public class Rev_element {

	public static void main(String[] args) {
		
		int [] array = new int [] {1, 2, 3, 4, 5};   
        
        System.out.println("Original array: "); 
     
        
        for (int i = 0; i < array.length; i++)
        {   
            System.out.print(array[i] + " ");   
        }    
          
        
        System.out.println(" "); 
        System.out.println("Array in reverse order: ");  
        
        for (int i = array.length-1; i >= 0; i--)
        {   
            System.out.print(array[i] + " ");   
        }    
    }  
	
}
