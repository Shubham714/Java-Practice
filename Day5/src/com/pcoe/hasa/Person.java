package com.pcoe.hasa;

public class Person {

	String name,city;
	int age;
	Date dob;
	
	static int x;
	
	static{
		x=50;
		System.out.println("Static block1 executed:"+x);
	}
	
	static{
		x=100;
		System.out.println("Static block2 executed:"+x);
	}
	
	
	public Person(String name, String city, int age, Date dob) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + ", dob=" + dob + "]";
	}
	
	void dispX() {
		System.out.println("X:"+x);
	}
	
}
