package com.cg.corejava;

public class JoinMethod {

	public static void main(String[] args)throws InterruptedException {
		
		Cat c=new Cat();
		c.start();
		c.join(1000,50);
		for(int i=0;i<5;i++) {
			System.out.println("meow meow meow");
		}
	}
}

class Cat extends Thread{
	public void run() {
		
		for(int i=0;i<1;i++) {
			System.out.println("Cat is saying");
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
