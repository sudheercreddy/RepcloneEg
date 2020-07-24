package Collections;

import java.util.ArrayList;
import java.util.Iterator;

//Array List - dynamic array
//can contain dubplicate evalue
//maintain insertion order
//


public class ArrayListEg {

	public static void main(String[] args) {
		//System.out.println("HI there ");
		ArrayList lst= new ArrayList();
		lst.add("123456");
		lst.add("HI there");
		lst.add(1234);
		lst.add(true);
		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));		
			}
		
		//generic
		ArrayList<Integer> lst1= new ArrayList<Integer>();
		lst1.add(1234);
		lst1.add(12121);
		lst1.add(32323);
		for(int i=0;i<lst1.size();i++) {
			System.out.println("this is generic of lst1"+lst1.get(i));		
			}
		ArrayList<String>lst2= new ArrayList<String>();
		lst2.add("sudheer");
		lst2.add("sunil");
		lst2.add("Chittireddy");
		
		System.out.println("aaaaaaaaaaaa"+ lst2);
		for(int i=0;i<lst1.size();i++) {
			System.out.println("this is generic of lst1"+lst1.get(i));		
			}
		
		Employee e= new Employee("sudheer",32,"softeare");
		Employee e1= new Employee("sunil",34,"softeare");
		Employee e2= new Employee("suresh",56,"softeare");
		
		ArrayList<Employee> ar4= new ArrayList<Employee>();
		ar4.add(e);
		ar4.add(e1);
		ar4.add(e2);
		
		//
		
		
		
		//Iterator to tranverse the values
		Iterator<Employee>it =ar4.iterator();
		while(it.hasNext()) {
		Employee emp=	it.next();
			System.out.println(emp.age);
			if (emp.age==32) {
				System.out.println("*Loterry******");
			}
			
			
			
			
		}
		
		
		
	}
}
