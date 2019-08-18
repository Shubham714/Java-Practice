package com.java.newinstance;

public class Test {

	public static void main(String[] args) {
	
try {
	Class c1=Class.forName("com.java.newinstance.Sample");	
	Sample s1=(Sample)c1.newInstance();
	s1.showMessage();
  }catch(Exception e)
{
	  System.err.println(e.getMessage());
}
	}

}
