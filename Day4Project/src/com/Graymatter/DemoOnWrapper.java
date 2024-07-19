
package com.Graymatter;

public class DemoOnWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive to wrapper
		int i=98;
		Integer iobj =i;
		//wrapper to primitive
		int j =iobj.intValue();
		//string to wrapper
		String sint="56";
		Integer x=Integer.parseInt(sint);
		//wrapper to string
		String s = x.toString();
		
		String str ="hello";
		Object obj = str;//upcasting
		
		String s1 = (String)obj;//downcasting

	}

}
