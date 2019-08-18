package com.vpcoe.map;

import java.util.*;
import java.util.Map.Entry;
public class MapDemo {
	void hashmap() {
		Map<Integer,String> m=new HashMap<>();
		m.put(1424, "BMW");
		m.put(4758, "AUDI");
		m.put(8427,"TATA");
		m.put(7845, "ROLLSRoyce");
		//System.out.println(m.get(7845));
		Set s=m.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer) itr.next();
			System.out.println(i+"=>"+m.get(i));
		}
	}
		void sortedmap() {
			SortedMap<Integer,String> m=new TreeMap<>();
			m.put(1424, "BMW");
			m.put(4758, "AUDI");
			m.put(8427,"TATA");
			m.put(7845, "ROLLSRoyce");
		   Set<Integer> s=m.keySet();
		   Iterator itr=s.iterator();
			 while(itr.hasNext()) {
				 Integer i=(Integer)itr.next();
				 System.out.println(i+"=>"+m.get(i));
			 }
		}
		
		void navmap() {
			NavigableMap<Integer,String> m=new TreeMap<>();
			m.put(1424, "BMW");
			m.put(4758, "AUDI");
			m.put(8427,"TATA");
			m.put(7845, "ROLLSRoyce");
		 
			 Set s=m.descendingKeySet();
			 
			 Iterator itr=s.iterator();
			 
			 while(itr.hasNext()) {
				 Integer i=(Integer)itr.next();
				 System.out.println(i+"=>"+m.get(i));
			 }
		}
			
	
	public static void main(String[] args) {
		MapDemo md=new MapDemo();
		md.sortedmap();
	}
}
