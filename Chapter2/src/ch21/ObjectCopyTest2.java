package ch21;


//깊은 복사
public class ObjectCopyTest2 {

	public static void main(String[] args) {

		Book[] BookList = new Book[5];
		Book[] CopyBook	= new Book[5];	
		BookList [0]= new Book("태백산맥1","글쓴이1");
		BookList [1]= new Book("태백산맥2","글쓴이2");
		BookList [2]= new Book("태백산맥3","글쓴이3");
		BookList [3]= new Book("태백산맥4","글쓴이4");
		BookList [4]= new Book("태백산맥5","글쓴이5");
	
		CopyBook[0] = new Book();
		CopyBook[1] = new Book();
		CopyBook[2] = new Book();
		CopyBook[3] = new Book();
		CopyBook[4] = new Book();
		
		for(int i=0; i<BookList.length; i++) {
			CopyBook[i].setTitle(BookList[i].getTitle());
			CopyBook[i].setAuthor(BookList[i].getAuthor());
			
		}
		
		BookList[0].setTitle("굿");
		BookList[0].setAuthor("키키");
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
