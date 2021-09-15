package ch23;

import java.util.ArrayList;

import ch21.Book;


// ArrayList
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("책 이름1","글쓴이1"));
		library.add(new Book("책 이름2","글쓴이2"));
		library.add(new Book("책 이름3","글쓴이3"));
		library.add(new Book("책 이름4","글쓴이4"));
		library.add(new Book("책 이름5","글쓴이5"));
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).ShowInfo();
		}

	}

}
