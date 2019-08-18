package com.vpcoe.innerclasses;

public class Main {
public static void main(String[] args) {
	Outer o=new Outer();
	o.show();
	
	Outer.Inner in=new Outer.Inner();
    in.disp();
}
}
