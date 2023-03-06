package Manish_pack;

import java.util.*;
import Manish_pack .LinkedListExample;

public class hashsett {
	public static void hashh(){
		System.out.println("HashSet Stuff");
		
		HashSet<String> hh= new HashSet(LinkedListExample.ll); 
		System.out.println(hh);
		
		hh.add("Random String1");
		hh.add("Random String2");
		hh.add("Random String1");
		
		for (Iterator i = hh.iterator(); i.hasNext();) {
			String s = (String) i.next();
			System.out.print(s+" ");
		}
	}
}