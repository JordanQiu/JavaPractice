package fileStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFile {
	

     public void ReadFileFromBytes(String fileName) throws IOException{
    	 File file = new File(fileName);
    	 
    	 file.setReadable(true);
   	  file.setWritable(true);
    	 try {
			InputStream in = new FileInputStream(file);
		  int read;
		  int a=98;//read接口的read()方法返回的是ascii码值
			while((read = in.read())!=-1){
				System.out.print((char)read);
			}
			System.out.println((char)a);
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     }
     
     public void ReadFileByChar(String filename) throws IOException{
    	 File file = new File(filename);
    	 InputStream in = null;
    	 in = new FileInputStream(file);
    	Reader read =  new InputStreamReader(in,"UTF8");
    	
    	
//    	//逐个字符地读
//    	int charRead;
//    	while((charRead=read.read())!=-1){
//    		System.out.print((char)charRead);
//    	}
    	//一次读多个字符
    	char[] tempChars = new char[30]; 
    	int readChars;
    	while((readChars = read.read(tempChars))!= -1){
    		for(int i=0;i<tempChars.length;i++){
    			
    	System.out.print(tempChars[i]);
    	
    		}
    		
    	}
    	in.close();
    	if(read != null){
    	read.close();
    	}
     }
     
     public void readFileByLine(String fileName) throws IOException{
    	 File file = new File(fileName);
    	Reader read = new FileReader(file);
    	BufferedReader bufferedRead = new BufferedReader(read);
    	String LineData;
    	int line=1;
    	 while((LineData = bufferedRead.readLine())!=null){
    		 System.out.println("Line:"+line+LineData);
    		 line++;
    	 }
    	 
     }
}

