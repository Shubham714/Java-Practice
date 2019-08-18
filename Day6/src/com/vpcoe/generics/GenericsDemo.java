package com.vpcoe.generics;

public class GenericsDemo<T> {

	private T obj;
	public GenericsDemo(T obj) {
		super();
		this.obj = obj;
	}
    
	@Override
	public String toString() {
		return "GenericsDemo [obj=" + obj + "]";
	}

	public void getObj(GenericsDemo<? extends String> obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		GenericsDemo<String> d=new GenericsDemo<>("100abc");
		d.getObj(d);
		
	}
}
