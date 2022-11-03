package com.cg.corejava;

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		second s=new second();
		third t=new third();
		s.msg();
		s.show();
		t.show();
		t.msg();
	}

}
class first{
	void msg()
	{System.out.println("In First Class");}
}

class second extends first{
void show()
{System.out.println("In Second Class");}
}

class third extends first{
	void show()
	{System.out.println("In Third Class");}
}

