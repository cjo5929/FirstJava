package ch15;

// 문자 단위 입출력 스트림
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		
		try(FileReader fr =new FileReader("reader.txt")){
			int i;
			while((i = fr.read()) != -1) {   //파일이 끝날 때 까지 끝나면 -1을 반환
				System.out.print((char)i);
			}
		}catch (IOException e) {
			e.printStackTrace();
			
		}
	}

}
