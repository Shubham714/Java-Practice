package com.vpcoe.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {
	 public static void main(String[] args) {
		
		 List<Integer> a=new Vector<>();
		 System.out.println("Size=>"+a.size()+"\t ArrayList=>"+a);
		 a.add(10);
		 a.add(20);
		 System.out.println("Size=>"+a.size()+"\t ArrayList=>"+a);
		 a.add(40);
		 a.add(30);
		 a.add(50);
		 a.add(60);
		 System.out.println("Size=>"+a.size()+"\t ArrayList=>"+a);
		 a.remove(3);//index
		 System.out.println("Size=>"+a.size()+"\t ArrayList=>"+a);
		
		 Iterator<Integer> itr=a.iterator();
		 System.out.println("----------Iterator-----------");
		 
		 while(itr.hasNext()) {
		System.out.println(itr.next());	
	      itr.remove();
		 }
		 System.out.println("Size=>"+a.size()+"\t ArrayList=>"+a);
	}
}
