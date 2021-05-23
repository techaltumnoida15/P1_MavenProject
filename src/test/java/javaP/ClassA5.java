package javaP;

public class ClassA5 {

	public void method1() {
		int[] arr = {1, 2, 3, 5};
		//Find missing number in array
		
		//int a[] = {1,2,3,4,5,6,7,9};
		
		int sum1 = 0;
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1+arr[i];
			
		}System.out.println("sum of the elements: "+sum1);
		int sum2=0;
		for(int i=1;i<=5;i++) {
			sum2 = sum2+i;
			
		}
		System.out.println("sum of the range is: "+sum2);
		
		System.out.println("Missing no is "+ (sum2 - sum1));
	}

	
	
	public void method2() {
		int a = 2;
		int b = 3;
		 System.out.println("before swapping numbers: ");  
		 System.out.println("a is: "+a);
	     System.out.println("b is: "+b);
		
		
		//Swipe these two numbers without using 3rd var
			a = a + b; 
	        b = a - b; 
	        a = a - b;   
	        System.out.println("before swapping numbers: "); 
	        //System.out.println("a is: "+a);
	        System.out.println("b is: "+b);
		
	}
	
	public void method3() {
		
	}
	
	public static void main(String[] args) {
		ClassA5 obj = new ClassA5();
		obj.method3();
		obj.method2();
		obj.method1();
		
	}
}
