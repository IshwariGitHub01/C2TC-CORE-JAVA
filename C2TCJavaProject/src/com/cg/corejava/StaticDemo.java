package com.cg.corejava;

public class StaticDemo {

	String name;
	int roll;
	static String university="SPPU University";
	
	void show() {
		System.out.println(name+" "+roll+" "+university);
	}
	
	public StaticDemo(String name,int roll) {
		super();
		this.name=name;
		this.roll=roll;
	}
	
	public static void main(String[] args) {
		
		StaticDemo s1=new StaticDemo("Shanaya",43);
		StaticDemo s2=new StaticDemo("Ariba",03);
		StaticDemo s3=new StaticDemo("Shohib",45);
		
		s1.show();
		s2.show();
		s3.show();
		
	}

}
