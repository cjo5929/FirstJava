package ch21;

//ArrayCopy, 얕은 복사
public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] BookList = new Book[5];
		Book[] CopyBook	= new Book[5];	
		BookList [0]= new Book("태백산맥1","글쓴이1");
		BookList [1]= new Book("태백산맥2","글쓴이2");
		BookList [2]= new Book("태백산맥3","글쓴이3");
		BookList [3]= new Book("태백산맥4","글쓴이4");
		BookList [4]= new Book("태백산맥5","글쓴이5");
	
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
