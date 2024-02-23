package Examples_of_filehandling;

import java.io.File;
import java.io.IOException;
import java.security.KeyStore.TrustedCertificateEntry;

public class FileFunctionality {

	public static void main(String[] args) throws IOException {
		/* 
		 *   here i have used final class to to create new files and also to get complete 
		 *   information about existing files.
		 */
		// firstly check the complete details about the file.
		File f1=new File("/home/bonami/Downloads/prince.txt");
		System.out.println("The file exists or not :"+f1.exists());   // file not exists
		
		// now firstly create file by using file class
		
		System.out.println("Creating file :"+f1.createNewFile());// it returns true if file created
		
		// get all details of already create file
		
		System.out.println("The file exists or not :"+f1.exists()); // true because file exists
        System.out.println("The length of file :"+f1.length());// file length 0 because empty file
        System.out.println("we have writing permission or not :"+f1.canWrite());// true i.e have writing permission
        System.out.println("We have reading permission or not : "+f1.canRead());// true i.e having reading permission
        System.out.println("the name of file is :"+f1.getName());
        
        // if we want to delete the existing file then
        
        System.out.println("The file is deleted or not :"+f1.delete());// true if file deleted.
	}

}
