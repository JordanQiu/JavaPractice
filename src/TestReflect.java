import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import arrayList.EmployeeList;


public class TestReflect {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		EmployeeList emp;
		
	   //forName()中一定要包名+类名
		Class t = Class.forName("arrayList.EmployeeList");
	   Object ot = t.newInstance();
      System.out.println(t.getClass()); 
     Method[] meth = t.getDeclaredMethods();
     for(int i=0;i<meth.length;i++){
    	System.out.println(meth[i]);
    }
    Field[] fd = t.getDeclaredFields();
    
   
     for(int i=0;i<fd.length;i++){
    	// System.out.println(fd[i]);
    	 // * private的成员变量必须使用getDeclaredField，并setAccessible(true),否则看得到拿不到
    	 fd[i].setAccessible(true);
    	 if(fd[i].getType()==List.class){
    		 //变量的值
    		 List al = (List)fd[i].get(ot);
    		 
      	 System.out.println(al);
    	 }

     }
  
     
     //Static变量class  返回一个Class类
     EmployeeList.class.getName();
     
     
     }
     
	}


