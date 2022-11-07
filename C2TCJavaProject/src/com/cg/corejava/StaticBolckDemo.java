package com.cg.corejava;

public class StaticBolckDemo {

	public static void main(String[] args) {
		System.out.println("Main Method");
	}
	
	static void m() {
		System.out.println("Static method");
	}

	static {
		System.out.println("Static Block One");
	}
	
	static {
		System.out.println("Static Block Two");
	}
}
