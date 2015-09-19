package fileStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class WriteFile {

	public void writeFile(String fileName) throws IOException{
		File file = new File(fileName);
		 file.setReadable(true);
		  file.setWritable(true);
		FileWriter fileWrite = new FileWriter(fileName,true);
		BufferedWriter Bfwr = new BufferedWriter(fileWrite);
		String str="aagg";
		Bfwr.write(str);
        Bfwr.close();	
	}
	public void writeFileByByte(String fileName,String text) throws IOException{
		File file = new File(fileName);
		FileOutputStream fop = new FileOutputStream(file);
		byte[] b=text.getBytes();
		Integer a = 1;
		
		fop.write(b);
		fop.flush();
		fop.close();
	}
	
	public void appendFileByByte(String fileName,char c) throws IOException{
		File file = new File(fileName);
		Writer write = new FileWriter(file.getName(),true);
		BufferedWriter bFw = new BufferedWriter(write);

		bFw.append(c);
	
		
	
		bFw.close();
	}
	
	public void writeFileByChar(String fileName) throws IOException, FileNotFoundException{
		File fileDir = new File(fileName);
		
		Writer out = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir)));

		out.append("Website UTF-8").append("\r\n");
		out.append("网站 UTF-8").append("\r\n");
		out.append("??????? UTF-8").append("\r\n");
		
		out.flush();
		out.close();
		
	}
	
}
