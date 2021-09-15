package ch05;

//스트림 재사용 X
import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Tomas");
		list.add("kangmin");
		list.add("seo");
		
		list.stream().sorted().forEach(n -> System.out.print(n +"\t"));
		System.out.println();
		list.stream().map(s -> s.length()).forEach(n -> System.out.print(n+ "\t"));
		
		
		
		
		
		
		
		
		
	}
	
	

}
