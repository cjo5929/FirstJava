package ch14;
//���Ͽ��� ����Ʈ �迭�� �ڷ� �б� ( �迭�� ���� �ִ� �ڷᰡ ���� �� ������ ���� )

import java.io.FileInputStream;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		try(FileInputStream fis =new FileInputStream("index.txt")){
			
			byte[] by = new byte[10];
			int i ;
			while( (i =fis.read(by)) != -1) {
			  /* for(int ch : by) {
				  System.out.print((char)ch);    ( �迭�� ���� �ִ� �ڷᰡ ���� �� ������ ���� )
			  }*/
				
				for(int j=0; j<i; j++) {
					System.out.print((char)by[j]);
				}
			  System.out.println(" : " + i + "����Ʈ ����");
			}
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
