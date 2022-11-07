package com.cg.corejava;

public class OuterClassDemo {

	int x=50;
	static int y=80;
	static class inner{
		
		void display() {
			System.out.println(y);   //if the variable is static then and then only we can display it in static class
			//System.out.println(x);    ----> this line shows error
		}
	}
	
	public static void main(String[] args) {
		OuterClassDemo.inner obj=new OuterClassDemo.inner();
		obj.display();
		y++;
		System.out.println(y);   //we can modify the value of static variable.
	}

}
