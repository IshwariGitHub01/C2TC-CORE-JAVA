package com.cg.corejava;

import java.util.Scanner;

public class SwappingBetweenTwo {

	public static void main(String[] args) {
		// Swapping Between two Numbers
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int num1=obj.nextInt();
		System.out.println("Enter Second Number:");
		int num2=obj.nextInt();
		
		System.out.println("Before Swapping:  "+num1+"    "+num2);
		
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After Swapping:  "+num1+"    "+num2);
	}


}
