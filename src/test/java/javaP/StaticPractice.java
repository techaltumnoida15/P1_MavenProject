package javaP;

public class StaticPractice {
	
	static {
		int i = 10;
		String s = "Java";
		int a = 9;
	}
	
	public static void method1() {
		//System.out.println(i);
		
		//System.out.println(a);
		
		method2();
	}
	
	public static void method2() {
		
	}
}

class classA{
	
	public static void main(String[] args) {
		StaticPractice.method1();
		
		//StaticPractice.i = 5;
	}
}
