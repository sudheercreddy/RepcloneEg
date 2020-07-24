package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLista_iterator {
//
	public static void main(String[] args) {
		LinkedList<String>lst1= new LinkedList();
		lst1.add("sudheer");
		lst1.addFirst("chittireddy");
		lst1.addLast("Kumar reddy");
		System.out.println(lst1.size());
		
		System.out.println(lst1);
		lst1.set(2, "kewl");
		
		System.out.println("**ForLoop***");
		for(int i=0 ; i<lst1.size();i++) {
			System.out.println(lst1.get(i));
		}
		System.out.println("**WhileLoop***");
		int i=0;
				while(i<lst1.size()) {
					System.out.println(lst1.get(i));
					i++;
				}
				System.out.println("**Iterator***");
			Iterator<String>     it=lst1.iterator();	
			while(it.hasNext())
			{
				System.out.println(it.next());
				 
			}
				
		
	}

}
