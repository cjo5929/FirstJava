package ch03;

//람다식 , 함수형 인터페이스 선

public class MyNumberTest {

	public static void main(String[] args) {
		MyNumber myNumber = (x,y)-> x > y ? x:y ;
		System.out.println(myNumber.getMax(20, 30));
	}

}
