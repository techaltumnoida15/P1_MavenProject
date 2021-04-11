package javaP;

public class ClassA7 {
	/*
	 * final => keyword
	 * with var => If a var is declared final then its value can not be changed. i.e CONSTANT
	 * with method => If a method is declared final then it can not be override.
	 * with class => If a class is declared final then it can not be inherited.
	 */
	
	
	public void method1() {
		final int i = 10;
		//i = 15;
		System.out.println(i);
	}

	/*
	public static void main(String[] args) {
		ClassA7 obj = new ClassA7();
		obj.method1();
	}
	*/
}
