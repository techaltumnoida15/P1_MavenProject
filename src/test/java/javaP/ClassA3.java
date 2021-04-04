package javaP;

import java.util.Scanner;

public class ClassA3 {
	
	
	public void checkOddEven() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.");
		
		int a = sc.nextInt();
		if(a%2 == 0) {
			System.out.println("No. is even");
		}
		else {
			System.out.println("No. is odd");
		}
	}
	
	public static void main(String[] args) {
		
		ClassA3 obj = new ClassA3();
		obj.checkOddEven();
			
	}

}
