package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int N,int key)
	{
		int left=0;int right=N-1; int Key;
		
		while(left<=right)
		{
			int mid =(left+right)/2;
			if(arr[mid] ==key)
			   return mid;
			else if(key<arr[mid])
				right= mid-1;
			else 
				left=mid+1;	
		}
		return -1;
	}

	public static void main(String[] args) {
		

        int Arr[] = {11,22,33,44,55,66};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter key to be searched  :");
		int key = sc.nextInt();
		
		int index=binarySearch(Arr,Arr.length,key);
		
		if(index!= -1)
			System.out.println("key is found at index  :" +index);
		else
			System.out.println("key is not found ...");
		
		sc.close();
	}

}
