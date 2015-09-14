package fileStream;

import java.io.IOException;

public class Example {
	public static void main(String agrs[]) throws IOException{
     ReadFile read = new ReadFile();
     //read.ReadFileFromBytes("C:\\Users\\Jordan.Qiu\\Desktop\\工作文件\\临时文件.txt");
		
     read.ReadFileByChar("C:\\Users\\Jordan.Qiu\\Desktop\\工作文件\\临时文件.txt");
 
	}
}
 