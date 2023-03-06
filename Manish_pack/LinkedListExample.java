package Manish_pack;


import java.util.*;
import Manish_pack .hashsett;

public class LinkedListExample {
	public static LinkedList<String> ll = new LinkedList<String>();
	static{
		ll.add("Hi");
		ll.add("There");
		ll.add("I");
		ll.add("Am");
		ll.add("Using");
		ll.add("You");
	}
	
	public static void main(String[] args) {
		
		
		
		for (String s : ll) {
			System.out.println(s);
		}
		System.out.println();
		
		ll.addFirst("First");
		ll.addLast("Last");
		System.out.println(ll);
		
		Object j =ll.get(6);
		System.out.println(j);
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println();
		for (Iterator<String> i = ll.iterator(); i.hasNext();) {
			String s = (String) i.next();
			System.out.print (s +" ");
		}
		System.out.println("\n");
		
		ListIterator li = ll.listIterator();
//		while(li.hasNext()){
//			li.set
//		}
		
		System.out.println("\n");
		
		ll.set(5,"us");
		System.out.println(ll);
		
		hashsett.hashh();
		hashsett.hashh();
		hashsett.hashh();
		
		System.out.println("\nJatin");
		Spliterator<String> s=ll.spliterator();
		
		s.forEachRemaining(System.out::println);
		
	}
}