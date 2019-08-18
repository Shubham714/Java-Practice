package com.vpcoe.collections;
import java.util.ArrayList;

public class ListDemo {
   public static void main(String[] args) {
	   ArrayList<Employee> ar=new ArrayList<>();
	   ar.add(new Employee(100,"John",50400));
	   ar.add(new Employee(101,"Johny",50040));
	   ar.add(new Employee(102,"Johns",50540));
	   Employee e=new Employee(103,"Jon",5000);
	   ar.add(e);

	   System.out.println(ar);
}
}
