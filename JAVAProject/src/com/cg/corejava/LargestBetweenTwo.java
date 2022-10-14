package com.cg.corejava;

import java.util.Scanner;

public class LargestBetweenTwo {

	public static void main(String[] args) {
		// Larger Between Two
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int num1=obj.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2=obj.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is greater");
		}
		else {
			System.out.println(num2+" is greater");
			
		}
	}

}
