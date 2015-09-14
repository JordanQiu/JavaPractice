package arrayList;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import set.User;

public class EmployeeList {
String test = "test";
 Character ca;
	 List<Employee> empList = new ArrayList();
	 public void addEmpList(){
		 Employee ee1 = new Employee();
		 ee1.setEmpId("1");
		 ee1.setEmpName("ee1");
		 Employee ee2 = new Employee();
		 ee2.setEmpId("2");
		 ee2.setEmpName("ee2");
		 Employee ee3 = new Employee();
		 ee3.setEmpId("3");
		 ee3.setEmpName("ee3");
		 
		boolean a = empList.add(ee1);
		boolean b = empList.add(ee2);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(empList.get(0).getEmpName());
//		System.out.println(empList.get(1).getEmpName());
//		boolean c = empList.remove(ee1);
//		System.out.println(c);
		//empList.set(0, ee3);
	ListIterator<Employee> iter = empList.listIterator();
	iter.add(ee3);
	while(iter.hasNext()){
		System.out.println(iter.next().getEmpName());
		
	}
	System.out.println(empList.size());
	
	 }
	
}
