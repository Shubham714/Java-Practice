package com.vpcoe.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
public class SetDemo {

void hashset() {
	Set<Integer> s=new HashSet<>();
	s.add(10);
	s.add(25);
	s.add(15);
	s.add(18);
	s.add(30);
	s.add(19);
	
	Iterator<Integer> itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

void sortedset() {
	SortedSet<Integer> s=new TreeSet<>();
	s.add(10);
	s.add(25);
	s.add(15);
	s.add(18);
	s.add(30);
	s.add(19);
	
	Iterator<Integer> itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
	
void navset() {
	NavigableSet<Integer> s=new TreeSet<>();
	s.add(10);
	s.add(25);
	s.add(15);
	s.add(18);
	s.add(30);
	s.add(19);
	s.add(18);
	Iterator itr=s.descendingIterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
	public static void main(String[] args) {
	SetDemo s=new SetDemo();
	s.navset();
		
	}
}
