package ch05;
// ½ºÆ®¸²
import java.util.Arrays;


public class IntArraysStreamTest {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println();
		
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}

}
