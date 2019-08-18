package com.vpcoe.collections;

import java.util.*;

public class QDemo {
	
	void queue() {
		 Queue<Integer> a=new LinkedList<>();
		 a.add(10);
		 a.add(20);
		 a.add(40);
		 a.add(20);
		 a.add(30);
		 a.add(50);
		 a.add(10);
		 a.add(60);
		 Iterator<Integer> itr=a.iterator();
		 
		 while(itr.hasNext()) {
		System.out.println(itr.next());	
	     // itr.remove();
		 }
	}
	
	void prioQueue() {
		 Queue<String> a=new PriorityQueue<>();
		 a.add("10");
		 a.add("20");
		 a.add("40");
		 a.add("20");
		 a.add("30");
		 a.add("50");
		 a.add("10");
		 a.add("60");
		 Iterator<String> itr=a.iterator();
		 
		 while(itr.hasNext()) {
		System.out.println(itr.next());	
	     // itr.remove();
		 }
	}
	public static void main(String[] args) {
		QDemo q=new QDemo();
		q.queue();
	}

}
