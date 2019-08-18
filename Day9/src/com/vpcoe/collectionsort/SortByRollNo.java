package com.vpcoe.collectionsort;
import java.util.Comparator;
public class SortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.rollNo>s2.rollNo) {
			return 1;
		}else if(s1.rollNo<s2.rollNo)
		{
			return -1;
		}else {
			return 0;
		}
	}

	
}
