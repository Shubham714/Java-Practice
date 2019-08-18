package com.vpcoe.serialization;

public class Employee implements java.io.Serializable {

private static final long serialVersionUID = -4940261412579151486L;
int empid;
  String name;
  transient int salary;
  static int ssn;
  
public Employee(int empid, String name, int salary, int ssn) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	this.ssn = ssn;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", ssn=" + ssn + "]";
}  
}
