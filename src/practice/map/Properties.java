package practice.map;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map;

import fileStream.WriteFile;

public class Properties {

	public static void main(String[] args) {
		//map对象->xml
		java.util.Properties prop = new java.util.Properties();
//		prop.setProperty("1", "test");
//		prop.setProperty("2", "test2");
//		
//        try {
//			prop.store(new FileWriter("F:\\JordanSpace\\practice\\NewFile.xml"), "comments");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
   
      
      //读xml文件
      try {
		prop.loadFromXML(new FileInputStream("F:\\JordanSpace\\practice\\NewFile.xml"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      Iterator iter =  prop.entrySet().iterator();
      while(iter.hasNext()){
    	Map.Entry entry =  (Map.Entry)iter.next();
    	System.out.println(entry.getKey());
    	System.out.println(entry.getValue());
      }
	}

}
