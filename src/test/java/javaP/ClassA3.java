package javaP;

public class ClassA3 {
	
	//Cunst is a special method, it execute automatically when object is created.
	//1. Its name must be same as class name
	//2. It doesnt return anything, not even void
	
	public ClassA3() {
		System.out.println("Cunst");
	}
	
	public ClassA3(int t) {
		System.out.println(t);
	}
	
	public void method1(int t) {
		System.out.println("Normal Method");
	}
	
	public void method1() {
		
	}
	
	public void method1(String s) {
		
	}
	//When there are more then 1 methods with same name in a class then this is known as method overloading.
	
	
	public static void main(String[] args) {
		ClassA3 obj = new ClassA3();   //Cunst will execute 
		
		obj.method1();
		
		ClassA3 obj2 = new ClassA3(3);
	}
}
