package Oops_part2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Using Non-generic data
		ArrayList ar1 = new ArrayList();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		ar1.add("Kanak");
		ar1.add("Kumar");
		//Displaying Data of ArrayList
		for(int i=0; i<ar1.size(); i++) {
			System.out.println("Value at index" + i + "=" + ar1.get(i));
		}
		
		//copy ArrayList elements to another object
		ArrayList ar2 = new ArrayList(ar1);
		System.out.println(ar2);
		
		//Using Generic data
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(50);
		obj.add(60);
		obj.add(70);
		obj.add(80);
		
		for(int j=0; j<obj.size(); j++) {
			System.out.println(obj.get(j));
			
		// String 
			
		ArrayList<String> str = new ArrayList<String>();
		str.add("Aman");
		str.add("Mayank");
		str.add("Kumar");
		str.add("Roy");
		
		}
		
		

	}

}
