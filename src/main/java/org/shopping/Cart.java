package org.shopping;

import java.util.*;
import java.util.HashMap;

public class Cart {

	

	public Cart() {
		HashMap<Integer, String> hmitems = new HashMap<Integer, String>();

		hmitems.put(1, "iphone");
		hmitems.put(2, "ipad");
		hmitems.put(3, "ipod");
		hmitems.put(4, "Tv");
		hmitems.put(5, "cd");

		for (Map.Entry m : hmitems.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	
		
	            
	    }
}
