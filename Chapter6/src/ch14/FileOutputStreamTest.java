package ch14;
//FileOutputStream 예제

//byte[] 배열에 A-Z 까지 넣고 배열을 한꺼번에 파일에 쓰기

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try (fos) {
			byte[] bt = new byte[26];
			byte data = 65;
			for (int i = 0; i < bt.length; i++) {
				bt[i] = data;
				data++;
			}
			fos.write(bt);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
