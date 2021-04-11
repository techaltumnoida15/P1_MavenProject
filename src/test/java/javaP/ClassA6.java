package javaP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassA6 {

	public void method1() {
		int i = 10;
		
		i = 15;
		System.out.println(i);
		
		//Array
		int[] arr1 = {2, 3, 4, 6, 7};
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		//==================================
		
		int[] arr2 = new int[2];
		arr2[0] = 67;
		arr2[1] = 50;
		arr2[3] = 55;
		
		//=================================
		
		int[] arr3 = new int[10];
		arr3[0] = 100;
		arr3[1] = 150;
	}
	
	public void listExample() {
		//Declare List    //java.util
		List<String> myL = new ArrayList<String>();
		
		myL.add("A");
		myL.add("B");
		myL.add("C");
		myL.add("C");
		myL.add("Y");
		myL.add("T");
		
		//myL.get
		
		System.out.println(myL);
		
		System.out.println("Size of arrayList = " + myL.size());
		
		System.out.println(myL.get(3));
		
		myL.remove(1);
		
		//System.out.println(myL);
		
	}

	public void setEx() {
		//Declare SET
		Set<String> myS = new HashSet<>();
		
		myS.add("A");
		myS.add("B");
		myS.add("C");
		myS.add("C");
		myS.add("Y");
		myS.add("T");
		
		//myS.get
		
		System.out.println(myS.size());
		
		System.out.println(myS);
	}
	
	public static void main(String[] args) {
		ClassA6 obj = new ClassA6();
		obj.setEx();
	}
}





















