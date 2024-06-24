package com.sunbeam;

public class bubbleSort {
	
	public static int bubbleSort(int arr[],int N)
	{
		int passes=0,comps=0;
		for(int i=0;i<N; i++) {
			passes++;
			
			for(int j=0 ;j< N-i ; j++) {
				comps++;
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
				
			}
		}
		System.out.println("Number of passes  :"+passes);
		System.out.println("Number of comparions  :"+comps);
	}

	public static void main(String[] args) {
       
	}

}
