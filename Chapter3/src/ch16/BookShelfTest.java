package ch16;

//인터페이스의 상속
public class BookShelfTest {

	public static void main(String[] args) {
		BookShelf book = new BookShelf();
		
		book.enQueue("책1");
		book.enQueue("책2");
		book.enQueue("책3");
		book.enQueue("책4");
		book.enQueue("책5");
		
		System.out.println(book.getSize());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
	}

}
