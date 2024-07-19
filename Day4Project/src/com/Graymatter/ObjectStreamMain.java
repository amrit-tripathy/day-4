package com.Graymatter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Customer c = new Customer("amrit",232);
		FileOutputStream fos =new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		fos.close();
//		
		FileInputStream fis = new FileInputStream("data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Customer c1 =(Customer)ois.readObject();
		System.out.println(c1);
		
		File f = new File("myfile");
		f.createNewFile();

	}

}
