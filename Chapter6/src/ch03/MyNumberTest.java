package ch03;

//���ٽ� , �Լ��� �������̽� ��

public class MyNumberTest {

	public static void main(String[] args) {
		MyNumber myNumber = (x,y)-> x > y ? x:y ;
		System.out.println(myNumber.getMax(20, 30));
	}

}