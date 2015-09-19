package practice.example;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Example {

		 
		
	 private static final String FILE_DIR = "c:\\folder";
	   private static final String FILE_TEXT_EXT = ".txt";
	 
	   public static void main(String args[]) {
		   
		System.out.println(Calendar.DAY_OF_WEEK);
	   }
	 
	   public  void  deleteFile(String folder, String ext){
	 
	     GenericExtFilter filter =this.new GenericExtFilter(ext);
	     File dir = new File(folder);
	 
	     //list out all the file name with .txt extension
	     String[] list = dir.list(filter);
	 
	     if (list.length == 0) 
	    	 return;
	 
	     File fileDelete;
	 
	     for (String file : list){
	   	String temp = new StringBuffer(FILE_DIR)
	                      .append(File.separator)
	                      .append(file).toString();
	    	fileDelete = new File(temp);
	    	boolean isdeleted = fileDelete.delete();
	    	System.out.println("file : " + temp + " is deleted : " + isdeleted);
	     }
	   }
	 
	   //inner class, generic extension filter 
	   public class GenericExtFilter implements FilenameFilter {
			 
		    private String ext;

		    public GenericExtFilter(String ext) {
		      this.ext = ext;             
		    }

		    public boolean accept(File dir, String name) {
		      return (name.endsWith(ext));
		    }
		 }

			}



