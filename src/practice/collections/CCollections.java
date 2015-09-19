package practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import list.EMP;

public class CCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10,i1=1,i2=0;
           List<Integer> al = new ArrayList<Integer>();
          al.add(i);
          al.add(i1);
           Collections.sort(al);
           //二分法不能用于set中？
         System.out.println(Collections.binarySearch(al,i)); 
         Collections.synchronizedList(new ArrayList());
         Collections.synchronizedMap(new HashMap());
         Collections.synchronizedSet(new HashSet());
       List unmodi = Collections.unmodifiableList(al);
         unmodi.add(i2);
         
         
         
	}

}
