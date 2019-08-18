package com.vpcoe.pkg2;
public class Addition {
	int add(int ...a) {
		int sum=0;
		for(int temp:a){
			sum+=temp;
		}
		return sum;
	}
	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println("Add:"+a.add());
		System.out.println("Add:"+a.add(1,2));
		System.out.println("Add:"+a.add(1,2,3));
		System.out.println("Add:"+a.add(1,2,3,4,5));	
	}
}
