package javaP;

import org.testng.Assert;

public class ClassA1 {

	int i = 10;
	String s = "Hello";
	
	
	public void method1() {
		System.out.println("Hi");
		
		System.out.println("Java");
		
		Assert.assertEquals(5, 6);
	}
	
	public int method2() {
		
		System.out.println("Selenium");
		return 2;
	}
	
	public static void main(String[] args) {
		//Start From Here
		
		//Object
		//ClassName objName = new ClassName();
		ClassA1 obj1 = new ClassA1();
		
		//obj1.method1();
		obj1.method2();
		
	}
}


/*
What is access specifier - public/private/protected/default
What is method?
*/