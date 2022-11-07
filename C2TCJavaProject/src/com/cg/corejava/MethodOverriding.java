package com.cg.corejava;

public class MethodOverriding {

	public static void main(String[] args) {
		
		child c=new child();
		c.Drive();
		c.Property();

	}

}

class parent{
	void Property() {
		System.out.println("Home/Money/Car/Factory");
	}
	
	
	void Drive() {
		System.out.println("Swift");
	}
}
class child extends parent{
	void Drive() {
		System.out.println("BMW");
	}
}