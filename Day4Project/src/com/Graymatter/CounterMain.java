package com.Graymatter;

public class CounterMain extends Thread {
	
	 CounterClass cc;
	
	public CounterMain(CounterClass cc) {
		super();
		this.cc = cc;
	}
	

	public CounterMain() {
		super();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
//			System.out.println(currentThread().getName());
			cc.updateCount();
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterClass ck = new CounterClass();
		CounterMain cm1 = new CounterMain(ck);
		CounterMain cm2 = new CounterMain(ck);
		
		cm1.start();
		cm2.start();

	}

}
