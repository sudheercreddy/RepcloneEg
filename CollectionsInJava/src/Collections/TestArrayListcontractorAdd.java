package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListcontractorAdd {

	public static void main(String[] args) {
		
		TestContracutorclass contracutorclass= new TestContracutorclass("sudheer", 32, "chittireddy");
		TestContracutorclass contracutorclass2= new TestContracutorclass("sluni",36,"chittireddy2");
		TestContracutorclass contracutorclass3= new TestContracutorclass("suresh",40,"chittireddy3");
		
		ArrayList<TestContracutorclass> lst = new ArrayList <TestContracutorclass>();
		lst.add(contracutorclass);
		lst.add(contracutorclass2);
		lst.add(contracutorclass3);
		
		Iterator<TestContracutorclass> it =lst.iterator();
		while(it.hasNext()) {
	TestContracutorclass emp=it.next();
	System.out.println(emp.age);
	System.out.println(emp.lName);
	System.out.println(emp.name); 
}
	}

}
