package com.cg.corejava;

public class FinalMethodDemo {

	public static void main(String[] args) {

	}

}

class parent{
	void Property() {
		System.out.println("Home/Money/Car/Factory");
	}
	
	
	final void Drive() {
		System.out.println("Swift");
	}
}
class child extends parent{
	//Final method does not override , it gives error
	/*void Drive() {
		System.out.println("BMW");
	}*/
}