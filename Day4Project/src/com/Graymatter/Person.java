package com.Graymatter;

public class Person {
	private String name;
	private String AadharID;
	private int age;
	public Person(String name, String aadharID, int age) {
		super();
		this.name = name;
		AadharID = aadharID;
		this.age = age;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", AadharID=" + AadharID + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharID() {
		return AadharID;
	}
	public void setAadharID(String aadharID) {
		AadharID = aadharID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
