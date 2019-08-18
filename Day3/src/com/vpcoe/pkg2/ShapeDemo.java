package com.vpcoe.pkg2;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s=new Shape();
		
		s.calcArea(6);
		System.out.println("Area of Tringle:"+s.calcArea(2,6));
		System.out.println("Area of Rectangle:"+s.calcArea(45.3,47.6f));
		System.out.println("Area of Square:"+s.calcArea(78.9f));
		
	}
}
