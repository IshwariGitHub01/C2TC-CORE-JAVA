package com.cg.corejava;

public class HybridInheritance {

	public static void main(String[] args) {
		
		FOUR f=new FOUR();
		THREE t=new THREE();
		f.show();
		f.f();
		f.msg();
		t.show();
		t.msg();

	}
}



class ONE{
	void msg()
	{System.out.println("In First Class");}
}

class TWO extends ONE{
void show()
{System.out.println("In Second Class");}
}

class THREE extends ONE{
	void show()
	{System.out.println("In Third Class");}
}

class FOUR extends TWO{
	void f() {System.out.println("In Fourth Class");}
}
