package ch06;
//연산 수행에 대한 구현을 할 수 있는 reduce()연산
//BinaryOperator를 구현하여 배열에 여러 문자열이 있을 때 길이가 가장 긴 문자열 찾기 예


import java.util.Arrays;
import java.util.function.BinaryOperator;


class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
	}
	

public class ReduceTest {

	public static void main(String[] args) {
		
		String [] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) -> 
		{if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
		}
				));
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
