package practice.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import list.EMP;

public class Hashmap {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//		HashMap hm = new HashMap();
//		EMP e1 = new EMP();
//		EMP e2 = new EMP();
//		EMP e3 = new EMP();
//		hm.put(1, e1);
//		hm.put(e2,e3);
//        Iterator iter = hm.entrySet().iterator();
//        while(iter.hasNext()){
//        	Map.Entry entry = (Map.Entry)iter.next();
//        	System.out.println(entry.getKey());
//        	System.out.println(entry.getValue());
//        }
//       System.out.println(hm.get(e2)); 
      try {
		Class Test = Class.forName("java.util.HashMap");
		Object hm1 = Test.newInstance();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	 }
