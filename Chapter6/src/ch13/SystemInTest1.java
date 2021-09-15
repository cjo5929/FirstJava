package ch13;

//System 클래스의 표준 입출력 멤버

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {
		
		System.out.println("알파벳을 여러개 쓰고 엔터를 누르시오.");
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
