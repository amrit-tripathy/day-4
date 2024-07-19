package com.Graymatter;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private String name;
	private int id;
	
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Customer() {
		super();
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	
}
