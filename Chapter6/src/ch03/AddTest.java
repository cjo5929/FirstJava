package ch03;

//람다식 (함수형 프로그래밍)
public class AddTest {

	public static void main(String[] args) {
		
		Add addL= (x,y) ->{return x+y;};
		
		System.out.println(addL.add(3, 4));
	}

}
