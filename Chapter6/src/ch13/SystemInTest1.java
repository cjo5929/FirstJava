package ch13;

//System Ŭ������ ǥ�� ����� ���

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {
		
		System.out.println("���ĺ��� ������ ���� ���͸� �����ÿ�.");
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read() )!= '\n') {
			System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
