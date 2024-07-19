package com.Graymatter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoOnfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("demo.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
//		  try (FileWriter fw = new FileWriter(file);
//		       BufferedWriter bw = new BufferedWriter(fw)) {
//
//		            // Write some lines of text to the file
//		            bw.write("Hello, this is a test.");
//		            bw.newLine();
//		            bw.write("Writing data to demo.txt file.");
//		            bw.newLine();
//		            bw.write("End of file writing example.");
//
//		            System.out.println("Data written to the file successfully.");
//
//		        } catch (IOException e) {
//		            System.err.println("An IOException occurred: " + e.getMessage());
//		        }
		FileWriter fw = new FileWriter(file);//to write in file
		fw.write("ggggggggg");
		fw.close();
		
		FileReader fr = new FileReader(file);
		int character;
		StringBuffer sbf = new StringBuffer();
		 String s="";
        while ((character = fr.read()) != -1) {
        	 sbf.append((char)character);
        	 s= sbf.toString();
        }
        System.out.println(s);
        fr.close();
        
	}

}
