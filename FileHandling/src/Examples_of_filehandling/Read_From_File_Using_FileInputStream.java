package Examples_of_filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class Read_From_File_Using_FileInputStream {

	public static void main(String[] args) throws IOException {
		// Read data from the file by using file input stream
		
		// so we have already created a file in program2 name of file is file1.txt use this file only.
		
		FileInputStream fi= new FileInputStream("/home/bonami/Downloads/file1.txt");
		// if we have to read single character then
		
//		int i=fi.read();
//		
//		System.out.println((char)i);
		
		// if we have to read whole sentence
		int j=0;
		while((j=fi.read())!=-1)
		{
			System.out.print((char)j+"");
		}
		
		fi.close();

	}

}
