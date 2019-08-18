package com.vpcoe.pkg1;

public class Manager extends Employee {

	int bonus;
	Manager(int bonus, int empId, int Salary) {
		super(empId, Salary);
		System.out.println("Derived Class constructor invoked");
		this.bonus=bonus;
	}

	void calcSalary(){
		System.out.println("Salary:"+(Salary+bonus));
	}
	
	public void display(){
		super.display();
		System.out.println("Called Display->Manager");
	}
	
	Manager getEmployee() {
		System.out.println(super.getEmployee());
		return new Manager(10000,100,50000);
	}
}
