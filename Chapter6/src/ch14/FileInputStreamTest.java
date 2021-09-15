package ch14;
//파일에서 바이트 배열로 자료 읽기 ( 배열에 남아 있는 자료가 있을 수 있음에 유의 )

import java.io.FileInputStream;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		try(FileInputStream fis =new FileInputStream("index.txt")){
			
			byte[] by = new byte[10];
			int i ;
			while( (i =fis.read(by)) != -1) {
			  /* for(int ch : by) {
				  System.out.print((char)ch);    ( 배열에 남아 있는 자료가 있을 수 있음에 유의 )
			  }*/
				
				for(int j=0; j<i; j++) {
					System.out.print((char)by[j]);
				}
			  System.out.println(" : " + i + "바이트 읽음");
			}
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
