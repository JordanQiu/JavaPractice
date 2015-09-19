package fileStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Example {

 public static void main(String agrs[]) throws IOException{
	 
	 String fileName = "C:\\Users\\seven\\Desktop\\Java疑问.txt";
	 
//	 ReadFile readfile = new ReadFile();
////	 readfile.readFileByLine(fileName);
////	 FileHandle fileHandle = new FileHandle();
////	 fileHandle.fileHandle("C:\\Users\\seven\\Desktop\\Java疑问.txt");
      WriteFile writeFile = new WriteFile();
      writeFile.writeFileByChar(fileName);
//   
//      readfile.ReadFileByChar(fileName);

   
      
 }    
 }

