package innerClass;

import practice.childToParent.Child;
import practice.childToParent.Parent;
import innerClass.OuterClass.innerClass;

public class Example extends Parent{

	public static void main(String[] args) {
		OuterClass outCls = new OuterClass();
          outCls.test();
         
       
         //当内部类为static时，可用外部类直接访问
        //  OuterClass.innerClass.testInner();
         
          
	}
	

}
