package com.pvcoe.files;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	
	void writeFile() throws IOException {
	try {
		FileOutputStream fout=new FileOutputStream("D:\\Source\\write.txt");
		for (int i=65;i<91;i++)
		fout.write(i);
		System.out.println("File Written");
		fout.close();
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	}	
	}
	void readFile() throws IOException {
		FileInputStream fin=new FileInputStream("D:\\Source\\write.txt");
		FileOutputStream fout=new FileOutputStream("D:\\Source\\write1.txt");
		int i;
		while((i=fin.read())!=-1) {
		System.out.print((char)i);
		fout.write(i);
		}
		fout.close();
		fin.close();
	}
	
	public static void main(String[] args) throws IOException {
		FileOperations fo=new FileOperations();
		fo.readFile();
	}
}
