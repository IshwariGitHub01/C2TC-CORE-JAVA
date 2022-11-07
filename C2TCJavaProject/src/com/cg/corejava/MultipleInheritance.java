package com.cg.corejava;

public class MultipleInheritance {

	public static void main(String[] args) {
		C c=new C();
		c.displayA();
		c.displayB();
	}
}

interface A1{
	void displayA();
}


interface B1{
	void displayB();
}

class C implements A1,B1{

	

	@Override
	public void displayB() {
		System.out.println("I am From B Interface");
		
	}

	@Override
	public void displayA() {
		System.out.println("I am From A Interface");
		
	}
}
