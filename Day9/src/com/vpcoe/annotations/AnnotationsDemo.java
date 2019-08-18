package com.vpcoe.annotations;

//@MyAnnotation(purpose = "testing", getId = 1)
public class AnnotationsDemo {
	@MyAnnotation(purpose = "testing", getId = 1)
	void display() {
		System.out.println("Annotation Test");
	}
}
