package com.vpcoe.reflections;

public class Student extends Base{

	int rollNo;
	public String name;
	private int marks;
	public String address;
	
	 Student(){
		
	}

	public Student(int rollNo, String name, int marks, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	
	void displayMarks() {
		System.out.println(marks);
	}
	
	void displayRollNo() {
		System.out.println(rollNo);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
    
}
