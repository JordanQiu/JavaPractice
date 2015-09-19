package practice.set;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
//根据compareto()返回的值进行排序,可通过compareto()返回值   对比查找set元素。
//不同类型的对象放在一个set中会报错
//向TreeSet集合中添加元素时，只有第一个元素可以无需实现CompareTo接口，后面添加的所有元素都必须实现CompareTo接口。另外向TreeSet中添加的应该是同一个类的对象，不然不好比较，否则也会引发ClassCastException异常。
//对于TreeSet集合而言，它判断两个对象不相等的标准是：两个对象通过equals方法比较返回false，或通过compareTo比较没有返回0，即使两个对象是同一个对象，TreeSet也会把他们当成两个对象处理。 
public class TtreeSet {
	
	public static void main(String arg[]){
	//没指定类型也可以，默认为object类型，但是如果一个set中放置多种对象，添加时就需要类型转换为同一种类型。	
     TreeSet trs = new TreeSet();
     SetData se = new SetData();
     se.setTest("test");
     System.out.println("result："+ trs.add(se));
     SetData se2 = new SetData();
     se2.setTest("test2");
     System.out.println(trs.add(se2));
    Iterator<SetData>  ite =  trs.iterator();
    while(ite.hasNext()){
    	System.out.println(ite.next());
    }
   
	}
	
}
