package ch21;


//���� ����
public class ObjectCopyTest2 {

	public static void main(String[] args) {

		Book[] BookList = new Book[5];
		Book[] CopyBook	= new Book[5];	
		BookList [0]= new Book("�¹���1","�۾���1");
		BookList [1]= new Book("�¹���2","�۾���2");
		BookList [2]= new Book("�¹���3","�۾���3");
		BookList [3]= new Book("�¹���4","�۾���4");
		BookList [4]= new Book("�¹���5","�۾���5");
	
		CopyBook[0] = new Book();
		CopyBook[1] = new Book();
		CopyBook[2] = new Book();
		CopyBook[3] = new Book();
		CopyBook[4] = new Book();
		
		for(int i=0; i<BookList.length; i++) {
			CopyBook[i].setTitle(BookList[i].getTitle());
			CopyBook[i].setAuthor(BookList[i].getAuthor());
			
		}
		
		BookList[0].setTitle("��");
		BookList[0].setAuthor("ŰŰ");
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
