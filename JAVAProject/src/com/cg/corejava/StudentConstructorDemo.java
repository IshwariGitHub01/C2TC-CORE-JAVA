package com.cg.corejava;

public class StudentConstructorDemo {

	String name;
	int RollNo;
	String Address;
	float marks;
	
	public StudentConstructorDemo(String name,int RollNo) {
		super();
		this.name=name;
		this.RollNo=RollNo;
	}
	
	public static void main(String[] args) {
		// Demo for Constructor class
		StudentConstructorDemo s1=new StudentConstructorDemo("Shiv",30);
		StudentConstructorDemo s2=new StudentConstructorDemo("Shakti",29);
		
		System.out.println(s1.name+"  "+s1.RollNo);
		System.out.println(s2.name+"  "+s2.RollNo);
		
		//Value of not declared attributes
		System.out.println(s1.Address);
		System.out.println(s2.marks);
	}

}
