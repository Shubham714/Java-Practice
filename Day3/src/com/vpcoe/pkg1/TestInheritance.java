package com.vpcoe.pkg1;

public class TestInheritance {

	public static void main(String[] args) {
		
		Manager m=new Manager(10000,100,70000);
		m.calcSalary();
		m.display();
        System.out.println(m.getEmployee());
	}

}
