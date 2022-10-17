package com.cg.corejava;

import java.util.Arrays;

public class ArraysClassOperations {

	public static void main(String[] args) {
		
		int[] arr= {30,22,44,65,80,36,55,11,63};
		
		int[] arr2= {30,22,44,6,56,70,91,13,60,0};
		
		int[] arr3= {30,22,44,65,80,36,55,11,63};
		
		//sort
		Arrays.sort(arr);
		System.out.println("Sorted array elements are");
		for(int i:arr) {
			System.out.println(i+" ");
		}
		System.out.println();
		
		//compare both arrays deeply on lexical analysis
		System.out.println(Arrays.compare(arr,arr2));
		System.out.println(Arrays.compare(arr,arr3));
		System.out.println();
		
		//mismatch-->finds the first index of unmatched element between two arrays
		System.out.println(Arrays.mismatch(arr,arr2));
		System.out.println(Arrays.mismatch(arr,arr3));
		System.out.println();
		
		//hashCode-->returns an integer hash code of this array instance
		System.out.println(Arrays.hashCode(arr));
		System.out.println();
		
		//for array to find the length, 'length' variable is used
		System.out.println("Length of arr2 is:"+arr2.length);
		System.out.println();
		
		//copyOf
		System.out.println("Integer Array"+Arrays.toString(arr));
		System.out.println("New array by copyOf");
		System.out.println("Integer Array"+Arrays.toString(Arrays.copyOf(arr, 11)));
		
	}

}
