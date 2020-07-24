package Collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Object> list1= new ArrayList<Object>();
		list1.add("Sudheer");
		list1.add("sunil");
		
		for (int i = 0; i < list1.size(); i++) {
			//System.out.println(list1.get(i));	
		}
		ArrayList<String>list2= new ArrayList<String>();
		list2.add("selenium");
		list2.add("");
		
		for (String all : list2) {
			System.out.println(all);
			
		}

	}

}
