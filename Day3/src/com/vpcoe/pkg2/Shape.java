package com.vpcoe.pkg2;
import java.lang.Math;
public class Shape {

	void calcArea(int rad){
		double res=Math.PI*rad*rad;
		System.out.println("Area of Circle:"+res);
	}
	double calcArea(int base, int height){
		return (0.5*base*height);
	}
   
	double calcArea(double l,float b){
	return l*b;
	}

	float calcArea(float side){
		return side*side;
	}
	
	
}
