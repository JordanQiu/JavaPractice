package abbstract;

import practice.childToParent.Child;

public abstract class Abbstract {

	public static void main(String[] args) {
		Child child = new Child();
	System.out.println(child.getLastName());
        callMeAbstract();
	}
//非抽象子类一定要实现抽象方法
   public abstract void test();
   
   public static void callMeAbstract(){
	   System.out.println("please call me function of AbstractClass,even if I am not abstract function ");
   } 
   
}
