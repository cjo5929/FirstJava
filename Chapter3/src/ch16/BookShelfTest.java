package ch16;

//�������̽��� ���
public class BookShelfTest {

	public static void main(String[] args) {
		BookShelf book = new BookShelf();
		
		book.enQueue("å1");
		book.enQueue("å2");
		book.enQueue("å3");
		book.enQueue("å4");
		book.enQueue("å5");
		
		System.out.println(book.getSize());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
	}

}
