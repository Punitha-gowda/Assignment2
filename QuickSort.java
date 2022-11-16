package com.sort;

public class QuickSort {

	static void quicksort(int[] arr, int low, int high) {
		
		if(low>high) return;
		int mid= low+(high-low)/2;
		int sachi= arr[mid];
		int a=low;
		int b=high;
		while(a<=b){
			  while(arr[a]<sachi)
				  a++;
			  while(arr[b]>sachi)
				  b--;
			  if(a<=b) {
				  int temp= arr[a];
				  arr[a]=arr[b];
				  arr[b]=temp;
				  a++;
				  b--;
			  }	  
		
		}
	      if(low<b)
	    	  quicksort(arr, low, b);
	      if(high>a)
	    	  quicksort(arr, a, high);
	      
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {10,30,60,40,80,20};
		System.out.println("Before Sort");
		for(int a=0;a<arr.length;a++)
			System.out.print(arr[a] +"\t");
		quicksort(arr, 0, arr.length-1);
		System.out.println("\nAfter Sort");
		for(int a=0;a<arr.length;a++)
		System.out.print(arr[a] +"\t");
	}

	}

