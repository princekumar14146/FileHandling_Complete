package Examples_of_filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_Into_File_using_FIleOutputStream {

	public static void main(String[] args) throws IOException {
		// here we have using FileOutputStream to write something into file
		
		
		// firstly creating a file
		File f1=new File("/home/bonami//Downloads/file1.txt");
		System.out.println("File created successfully :"+f1.createNewFile());
		
		// writing something into already created file
		
		FileOutputStream fo=new FileOutputStream("/home/bonami//Downloads/file1.txt",true); // here true means append
		String s="My name is prince kumar";
		byte[] b1=s.getBytes();   // convert string into byte array
		
		fo.write(b1);   // write in file
		
		String c=" I am a software developer";
		byte[] b2=c.getBytes();
		fo.write(b2);
		
		fo.close();
		
	}

}
