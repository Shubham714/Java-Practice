package com.vpcoe.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	
	void showMetadata() {
	Student s1=new Student();
	
	System.out.println("s1 is Instance of:"+(s1 instanceof Student));
	
		Class c1=s1.getClass();
		System.out.println("C1=>"+c1);
		System.out.println("Is Interface:"+c1.isInterface());
		try {
			Class c2=Class.forName("com.vpcoe.reflections.Student");
			System.out.println("C2=>"+c2);
			
			Field fields[]=c2.getDeclaredFields();
			
			for(Field f:fields) {
				System.out.println("Declared->"+f.getModifiers()+"-"+f.getName());
			}
			
        Field fields1[]=c2.getFields();
			
			for(Field f:fields1) {
				System.out.println(f.getModifiers()+"-"+f.getName());
			}
			
			Method m[]=c2.getDeclaredMethods();
			
			for(Method m1:m) {
				System.out.println("Method:->"+m1.getModifiers()+"-"+m1.getName());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("c1-base=>"+c1.getSuperclass());
	}
	
	public static void main(String[] args) {
	
		new ReflectionDemo().showMetadata();
	}
}
