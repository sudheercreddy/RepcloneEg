package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test_Iterator_Class_object {

	public static void main(String[] args) {
		
		Iterator_Class_object lst1= new Iterator_Class_object("USA", "Sudheer", "CHittiReddy");
		Iterator_Class_object lst2= new Iterator_Class_object("Australia", "Sunil", "CHittiReddy");
		Iterator_Class_object lst3= new Iterator_Class_object("India", "Suresh", "CHittiReddy");
		System.out.println(lst1);
		ArrayList<Iterator_Class_object> lst = new ArrayList<Iterator_Class_object>();
		lst.add(lst1);
		lst.add(lst2);
		lst.add(lst3);
		//System.out.println(lst);
		Iterator <Iterator_Class_object> ll= lst.iterator();
		while(ll.hasNext()) {
			Iterator_Class_object eee=ll.next();
			System.out.println("Country is -"+  eee.country);
			System.out.println("Firstname is -"+eee.Fname);
			System.out.println("Lastname is -"+ eee.LName);
		}
	}

}
