package com.cg.corejava;

public class ThreadUsingClass {

	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();

		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread{
	
	public void run() {
		
		try {
			for(int i=0;i<5;i++) {
				
				Thread.sleep(800);
				System.out.println("In Thread1 i is --> "+i);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

//Thread2
class Thread2 extends Thread{
	
public void run() {
		
		try {
			for(int i=5;i<10;i++) {
				
				Thread.sleep(800);
				System.out.println("In Thread2 i is --> "+i);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
//if threads are having same timing the it will execute randomly
//if threads are having different time then it will execute on by on or one after other

}



