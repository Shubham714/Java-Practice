package com.vpcoe.string;

public class StringDemo {
public static void main(String[] args) {
	StringBuilder str=new StringBuilder("Welcome ");
	str.append("vpcoe student");
	System.out.println(str);
	str.reverse();
	System.out.println(str);
	str.reverse();
	str.insert(8,"to ");
	System.out.println(str);
}
}
