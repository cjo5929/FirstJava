package ch21;

//ArrayCopy, ���� ����
public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] BookList = new Book[5];
		Book[] CopyBook	= new Book[5];	
		BookList [0]= new Book("�¹���1","�۾���1");
		BookList [1]= new Book("�¹���2","�۾���2");
		BookList [2]= new Book("�¹���3","�۾���3");
		BookList [3]= new Book("�¹���4","�۾���4");
		BookList [4]= new Book("�¹���5","�۾���5");
	
		 System.arraycopy(BookList, 0, CopyBook, 0, 5);
	
		 System.out.println("====BookList====");
	for(Book book: BookList) {
		System.out.println(book);
		book.ShowInfo();
	}
	
	 System.out.println("====CopyBook====");
		for(Book book: CopyBook) {
			System.out.println(book);
			book.ShowInfo();
		}
	}

}
