package ch06;

//���׸�(Generic) ���α׷��� - �����̵� ���� �� �ִ� Ÿ��
public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Plastic> plasticPrinte =new GenericPrinter<>();
		plasticPrinte.setMaterial(new Plastic());
		System.out.println(plasticPrinte.toString());
		
	}

}
