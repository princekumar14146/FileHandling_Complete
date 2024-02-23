package Examples_of_filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_from_file_using_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		// now using buffered reader to read the content from the file
		
		BufferedReader b1=new BufferedReader(new FileReader("/home/bonami/Downloads/file1.txt"));
//        int c=B1.read();
//        System.out.println((char)c);
        
        // read whole line
        
//        int i=0;
//        while((i=b1.read())!=-1)
//        {
//        	System.out.print((char)i+"");
//        }
        
        // if we want to read whole line at a timethen
        
        System.out.print(b1.readLine());
	}

}
