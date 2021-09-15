package ch02;
public class MyArrayTest {
	
	//Array 구현하기

	public static void main(String[] args) {

		MyArray array = new MyArray();
		array.addElement(10);
		array.addElement(20);
		array.addElement(30);
		array.insertElement(1, 40);
		array.printAll();
		
		System.out.println("===============");
		array.removeElement(1);
		array.printAll();
		System.out.println("===============");
			
		array.addElement(70);
		array.printAll();
		System.out.println("===============");
		array.removeElement(1);
		array.printAll();
		
		System.out.println("===============");
		System.out.println(array.getElement(2));
		
	}
}
