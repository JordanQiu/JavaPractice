package fileStream;

import java.io.File;
import java.io.IOException;

public class FileHandle {
  public void fileHandle(String fileName) throws IOException{
	  File file = new File(fileName);
	  if (file.createNewFile()) {
		System.out.println("The file has been created");
	}
	  else
	  {System.out.println("The file has been exist");}
	  
	  file.setReadable(true);
	  file.setWritable(true);
	  System.out.println(file.canRead());
	  System.out.println(file.canWrite());
	  
	  
  }
  
  
  
}
