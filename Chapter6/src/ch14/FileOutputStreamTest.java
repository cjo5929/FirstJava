package ch14;
//FileOutputStream ����

//byte[] �迭�� A-Z ���� �ְ� �迭�� �Ѳ����� ���Ͽ� ����

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
