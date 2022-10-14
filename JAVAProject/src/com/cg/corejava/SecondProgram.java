package com.cg.corejava;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		// Use of Scanner Class
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int num1=obj.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2=obj.nextInt();
		
		int sum=num1+num2;
		
		System.out.println("Addition of above numbers is:  "+ sum);
		
		
		

	}

}
