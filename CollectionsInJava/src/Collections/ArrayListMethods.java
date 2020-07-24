package Collections;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Object> lst1 = new ArrayList<Object>();
		lst1.add("sudheer");
		lst1.add("Reddy");
		lst1.add("Kumar");
		lst1.add("Chittireddy");
		System.out.println("************ADD  All");
		ArrayList<Object> lst2 = new ArrayList<Object>();

		lst2.addAll(lst1);

		for (int i = 0; i < lst2.size(); i++) {
			// System.out.println("Added All");
			System.out.println(lst2.get(i));
		}
		ArrayList<Object> lst3 = new ArrayList<Object>();
		lst3.add("sudheer");
		System.out.println("************Retain   All");
		lst3.retainAll(lst2);
		for (int i = 0; i < lst3.size(); i++) {
			System.out.println(lst3.get(i));
		}

		// ****************************************************

		// System.out.println("************Removed All");
		lst2.removeAll(lst1);

		for (int i = 0; i < lst2.size(); i++) {
			System.out.println("Remove  All");
			System.out.println(lst2.get(i));
		}
	}

}
