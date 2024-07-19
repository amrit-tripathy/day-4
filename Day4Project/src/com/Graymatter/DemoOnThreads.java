package com.Graymatter;

public class DemoOnThreads extends Thread{
	@Override
	public void run() {
		
		System.out.println(currentThread().getName());//Thread-0
		System.out.println(currentThread().getId());//21
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getPriority()); //5
		System.out.println(Thread.MAX_PRIORITY);//10
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.NORM_PRIORITY);//5
		System.out.println(currentThread().isAlive());//true
		System.out.println(currentThread().isDaemon());//false as main is not running on backround
		
		DemoOnThreads dot = new DemoOnThreads();
		DemoOnThreads dot1 = new DemoOnThreads();//new thread
		dot.start();//whenever u use start u need a run method
		dot1.start();
		
		
	}

}
