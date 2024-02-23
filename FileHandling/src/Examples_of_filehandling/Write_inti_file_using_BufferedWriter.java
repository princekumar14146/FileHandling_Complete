package Examples_of_filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_inti_file_using_BufferedWriter {

	public static void main(String[] args) throws IOException {
		// using buffered writer to write into file.
		
		BufferedWriter b1=new BufferedWriter(new FileWriter("/home/bonami/Downloads/file1.txt",true));
        b1.write(" And my goal is to be a senior developer ");
        
        
        String name="Hi everyone ";
        char[] arr=name.toCharArray();
        b1.write(arr);
        b1.close();
	}

}
