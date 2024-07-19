package com.Graymatter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOnByteStreams {

	public static void main(String[] args) throws IOException {

		//writing to file
		FileOutputStream fos =new FileOutputStream("data.txt");
		String s ="hello world";
		fos.write(s.getBytes());
		fos.close();
		
		//reading from file
		FileInputStream fis = new FileInputStream("data.txt");
		int ch;
		StringBuffer sbf = new StringBuffer();
		while((ch=fis.read())!=-1) {
			sbf.append((char)ch);
		}
		System.out.println(sbf);
		fis.close();
		

	}

}
