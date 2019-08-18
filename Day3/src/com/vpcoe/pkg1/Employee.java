package com.vpcoe.pkg1;

public class Employee {

	int empId,Salary;
	
	Employee(int empId, int Salary){
		System.out.println("Base Class constructor invoked");
		this.empId=empId;
		this.Salary=Salary;
	}
	protected void display(){
		
		System.out.println("Called Display->Employee");
	}
	
	Employee getEmployee() {
		return new Employee(100,50000);
	}
}
