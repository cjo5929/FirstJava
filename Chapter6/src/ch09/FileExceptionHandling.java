package ch09;

//예외처리 - FileExceptionHandling , try-catch-finally 문
//try-with-resources

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
	public static void main(String[] args) {
		
		/* FileInputStream fis = null ;
		
		try {
			fis = new FileInputStream("A.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}finally {
			
			if( fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			System.out.println("finally");
		}
		System.out.println("ggg");

	*/
		//try-with-resources
		try(FileInputStream fis= new FileInputStream("a.txt")){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
