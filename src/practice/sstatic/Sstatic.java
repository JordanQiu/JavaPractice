package practice.sstatic;

public class Sstatic {
     private static String test;//对象共享变量值
     private int i=0;
     //静态方法中不能操作非成员变量和非静态方法,不能用this
     static void test(){
        String notSta;//局部变量
        
    	 testSta();
    	 
    	
     } 
     static void testSta(){
    	 System.out.println("I am static function");
     }
     void testNotSta(){
    	 System.out.println("I am not static function");
     }
}
