package Examples_of_filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;

public class Write_common_words_in_Third_File {

	public static void main(String[] args) throws IOException {
	  /*
	   *   Create two files and store content in them and then find common in both file i.e character
	   *   and store it into the third file.
	   */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Content in first file :");
		String str1=sc.nextLine();
		System.out.println("Enter the Content in second file :");
		String str2=sc.nextLine();
		// creating all three files
		
		BufferedWriter b1=new BufferedWriter(new FileWriter("/home/bonami/Downloads/file1.txt"));
		// content to first file
		 b1.write(str1);
		 b1.close();
		
		BufferedWriter b2=new BufferedWriter(new FileWriter("/home/bonami/Downloads/file2.txt"));
		// content to second file
		b2.write(str2);
		b2.close();
		
		BufferedWriter b3=new BufferedWriter(new FileWriter("/home/bonami/Downloads/file3.txt"));
		
		
		// check the common character in both file and store it into third file
		BufferedReader br1=new BufferedReader(new FileReader("/home/bonami/Downloads/file1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("/home/bonami/Downloads/file2.txt"));
		BufferedReader br3=new BufferedReader(new FileReader("/home/bonami/Downloads/file3.txt"));
		
		// read content of first file
		String str3=br1.readLine();
		char[] arr1=str3.toCharArray();
		int size1=arr1.length;
		// read content of second file
		String str4=br2.readLine();
		char[] arr2=str4.toCharArray();
		int size2=arr2.length;
		String str5="";
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					str5=str5+arr2[j];
					arr2[j]=arr2[size2-1];
					size2--;
					j--;
				    break;
				}
			}
		}
		
		b3.write(str5);
		b3.close();
		System.out.println("The content in third file is :");
		// the content in third file is 
		int l=0;
		while((l=br3.read())!=-1)
		{
			System.out.print((char)l+"");
		}
		
		// one more way to solve this question
//		String str=bufferedReader.readLine();
//		String str1=bufferedReader1.readLine();
//		
//		  bufferedReader.close();
//		  bufferedReader1.close();
//		
//		BufferedWriter bufferedWriter3=new BufferedWriter(new FileWriter("/home/bonami/Downloads/prince3.txt"));
//	    	if(str.contains(str1))
//	    	{
//	    		bufferedWriter3.write(str1);
//	    	}
//	    	
//	   
//	  
//	   
//	   
//	    bufferedWriter3.close();
//			

	}

}
