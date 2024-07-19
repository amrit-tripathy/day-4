package com.Graymatter;

public class Main {

	public static void main(String[] args) throws AgeNotSufficientException {
		// TODO Auto-generated method stub
		Person p = new Person("amrit","777887",10);
		if(p.getAge()<18) {
			throw new AgeNotSufficientException("Person age need to be more than 18");
		}
		else {
			System.out.println("eligible to vote");
		}
		
	}

}
