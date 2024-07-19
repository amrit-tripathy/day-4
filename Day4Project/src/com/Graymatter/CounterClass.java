package com.Graymatter;

public class CounterClass {
	private int count = 0;
	public synchronized void updateCount(){
//		synchronized (this) {
			count++;
			printCount();
//		}
		
	}
	public void printCount() {
		System.out.println(count);
	}

}
