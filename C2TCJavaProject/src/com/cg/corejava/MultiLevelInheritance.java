package com.cg.corejava;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Z obj=new Z();
		obj.a=10;
		obj.b=70;
		obj.msg();
		obj.show();
		
	}

}

class X{
	int a;
}

class Y extends X{
	int b;
	void msg() {
	System.out.println("In B "+a+" "+b);
	}
}

class Z extends Y{
	int c=101;
	void show() {
		System.out.println("In C "+a+" "+b+" "+c);
	}
}