package ch06;

//제네릭(Generic) 프로그래밍 - 무엇이든 담을 수 있는 타입
public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Plastic> plasticPrinte =new GenericPrinter<>();
		plasticPrinte.setMaterial(new Plastic());
		System.out.println(plasticPrinte.toString());
		
	}

}
