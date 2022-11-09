package com.cg.corejava;

public class MultiThreadingUsingInterface {

	public static void main(String[] args) {

		WallWatch w=new WallWatch();
		SmartWatch s=new SmartWatch();
		
		w.run();
		s.run();
	}
}


class WallWatch implements Runnable{
	
	public void run() {
		
		try {
			for(int i=1;i<=12;i++) {
				
				Thread.sleep(800);
				System.out.println("Wall Watch Timming --> "+i);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

//Thread2
class SmartWatch implements Runnable{
	
public void run() {
		
		try {
			for(int i=1;i<=24;i++) {
				
				Thread.sleep(800);
				System.out.println("Smart Watch Timming --> "+i);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}


}