package com.vpcoe.collectionsort;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
	 
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(52,"Sam",25));
		al.add(new Student(22,"John",27));
		al.add(new Student(30,"Henry",22));
		al.add(new Student(45,"Michel",24));
		
		System.out.println("------Before Sorting-------");
		for(Student s:al) {
			System.out.println(s);
		}
		
		Collections.sort(al,new SortByRollNo());
		System.out.println("------Sort by Rollno--------");
		for(Student s:al) {
			System.out.println(s);
		}
		
		Collections.sort(al,new SortByName());
		System.out.println("------Sort by Name--------");
		for(Student s:al) {
			System.out.println(s);
		}
}
}
