package com.sunbeam;

import java.util.Scanner;

public class linearSreach {
	
	public static int linearSearch(int arr[],int N ,int key) {
		for(int i=0 ;i<N ; i++)
		{
			if(key == arr[i])
				return i;
				
		}
		return -1;		
	}


	public static void main(String[] args) {
    int arr[] =	{22,33,11,44,66,44,46,99,88};
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter key to be searched  :");
    int key = sc.nextInt();
    
    int index = linearSearch(arr,arr.length,key);
    if(index != -1)
    	System.out.println("key is found at index  :" +index);
    else
        System.out.println("key is not found ...");
    
    sc.close(); 
	}   

}
