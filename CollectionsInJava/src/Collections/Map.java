package Collections;

import java.util.HashMap;

public class Map {
//Exampls of maps
	//Map<Key><Value>
	//Error codes (1.2.1= fatal error)
	//Zipcodes(boston,66011)
	//map of managers and employees
	//test data storage
	//configuration envirinmental variable
	//headers in API
	
	//Methods
	//1.PUT
	//2.GET
	//3contains Key
	//4.PUTALL
	//remover(key)
	//keySet()
	//hash map is an class and it implement
	//MAP interface
	//it contains only unique elements
	//Stores values in form of key and value pair
	//it maintains no order
	
	public static void main(String[]args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "60002");
		hm.put(2, "60003");
		hm.put(3, "60004");
		hm.put(4, "60005");
		
		
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet().size());
		System.out.println(hm.values().size());
		
		

		
	}
}
