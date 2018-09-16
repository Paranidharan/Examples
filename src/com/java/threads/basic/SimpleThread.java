package com.java.threads.basic;

public class SimpleThread {

	public static void main(String [] arg ) {
		
		Thread t = new Thread();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
