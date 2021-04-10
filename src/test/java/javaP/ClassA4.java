package javaP;

public class ClassA4 {

	int t = 10;
	
	public void method1() {
		try {
			int a = t/0;
			System.out.println(a);
		}
		catch(Exception ex) {
			System.out.println("Can not divide by Zero.");
		}
	}

	public void method2() {
		String[] arr = {"A", "B", "C", "C"};
		
		try {
			System.out.println(arr[4]);
		} catch (Exception e) {
			//System.out.println(e.toString());
			System.out.println("There is no valid index what you have given.");
		}
	}
	
	public void method3() {
		int t = 10;
		int[] arr = {3, 5, 2, 7};
		
		try {
			//int a = 10/0;    //Arithmetic
			
			//int d = arr[6];    //ArrayIndexOutofBound
			
			//Null Pointer Exception
		}
		catch(ArithmeticException ex) {
			System.out.println("");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			
		}
		catch(Exception e) {
			System.out.println("");
		}
	}
	
	public void method4() {
		int t = 10;
		
		try {
			int a = t/2;
			System.out.println(a);
		} 
		catch (Exception e) {
			System.out.println("Can not divide by ZERO.");
		}
		
		//finally is a block - It gives you gurantee that code written inside will get execute always.
		finally {
			System.out.println("I am in finally");
		}
	}
	
	public static void main(String[] args) {
		ClassA4 obj = new ClassA4();
		//obj.method1();
		obj.method4();
	}
}
