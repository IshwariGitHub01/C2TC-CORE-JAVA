package com.cg.corejava;

public class AbstractDemo {

	//extending abstract class
	
	public static void main(String[] args) {
		Dog Moti=new Dog();
		Moti.Loyal();
	}

}

abstract class Pet{
	abstract void Loyal();
}

class Dog extends Pet{
	
	//override
	void Loyal() {
		System.out.println("Dog is a Loyal Pet");
	}
}
