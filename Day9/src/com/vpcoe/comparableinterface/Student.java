package com.vpcoe.comparableinterface;

public class Student implements Comparable<Student>{
	int rollNo;
	String name;
	int age;
	
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student s) {
		if(age>s.age) {
			return 1;
		}else if(age<s.age)
		{
			return -1;
		}else {
			return 0;
		}
	}
  
	
}
