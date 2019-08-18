package com.vpcoe.objectclass;
public class Demo {
	int val1, val2;
	public Demo(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}
	
 	@Override
	public String toString() {
		return "Demo [val1=" + val1 + ", val2=" + val2 + "]";
	}

	public static void main(String[] args) {
      Demo d=new Demo(10,25);
      
      System.out.println(d.toString());
	}
}
