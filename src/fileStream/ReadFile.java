package fileStream;

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
    	 
    	 try {
			InputStream in = new FileInputStream(file);
		  int read = in.read();
			while(read!=-1){
				System.out.write(read);
			}
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
    	Reader read =  new InputStreamReader(in);
//    	//逐个字符地读
//    	int charRead =  read.read();
//    	while(charRead!=-1){
//    		System.out.println((char)charRead);
//    	}
    	//一次读多个字符
    	char[] tempChars = new char[30];
    	int readChars = read.read(tempChars);
    	while(readChars != -1){
    		for(int i=0;i<tempChars.length;i++){
    			
    	System.out.print(tempChars[i]);
    	
    		}
    		
    	}
    	in.close();
    	if(read != null){
    	read.close();
    	}
     }
}
