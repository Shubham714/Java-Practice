package com.vpcoe.coning;

public class Student implements Cloneable{
  int rollNo;
  String name;
  
public Student(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
  
}
