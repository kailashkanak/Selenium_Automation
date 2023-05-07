package Oops_part2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// Creating Linked list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Test");
		ll.add("QTP");
		ll.add("RPA");
		ll.add("RFT");
		System.out.println("Content of Linked List"+ ll);
		ll.addFirst("Kailash");
		ll.addLast("Automation");
		System.out.println("Content of Linked List"+ ll);
		
		// get()
		System.out.println(ll.get(0));
		
		//set()
		
		ll.set(0,"Tom");
		System.out.println("Content of Linked List"+ ll);
		
		//Removing the first element by using removeFirst()
		ll.removeFirst();
		System.out.println("Content of Linked List"+ ll);
		
		//removeLast()
		ll.removeLast();
		System.out.println("Content of Linked List"+ ll);
		
		//How to print elements of Linked list
		//1. For Loop
		
		for(int i=0; i<ll.size(); i++) {
			System.out.println("Value at index" + i + "=" + ll.get(i));
		}
		
		//2. Advance For Loop
		for(String str:ll) { //This linked list stores string value 
			System.out.println(str);
		}
		
		//3. Iterator
		
		Iterator<String> it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4. While loop
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
	}

}
