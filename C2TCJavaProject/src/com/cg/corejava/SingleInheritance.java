package com.cg.corejava;

public class SingleInheritance {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.arg();
		obj.sum();

	}

}

class A{
	int a=10,b=22;
	void arg(){
		System.out.println("Variables are : "+a+" "+b);
	}
}

class B extends A{
	int sum;
	void sum() {
		System.out.println("Sum : "+(a+b));
	}
}
