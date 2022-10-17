package com.cg.corejava;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// SCAANING AND PRINTING ARRAY ELEMENTS
		
		int[] arr=new int[40];
		int size;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size of array:");
		size=obj.nextInt();
		
		System.out.println("Enter array "+size+" elements");
		for(int i=0;i<size;i++) {
			arr[i]=obj.nextInt();
		}
		
		System.out.println("Entered array elements are");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();System.out.println();
		System.out.println("End of Program!");
	}

}
