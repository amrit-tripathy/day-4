package com.Graymatter;

public class DemoOnExceptions {
	
	public static void dodiv(int a,int b)throws Exception{
		if(b==0) {
			throw new Exception(); //whenever you throw exception then you need to catch exception same type
		}
			System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nume=7,deno=0;
		try {
			System.out.println(nume/deno);
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("h");
		}
		
		
		System.out.println("wow");
		
		//
		try {
			dodiv(6,0);
		}catch(Exception a) {
			a.printStackTrace();
		}
		
		
		

	}

}
