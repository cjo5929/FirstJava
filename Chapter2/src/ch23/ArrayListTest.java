package ch23;

import java.util.ArrayList;

import ch21.Book;


// ArrayList
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("å �̸�1","�۾���1"));
		library.add(new Book("å �̸�2","�۾���2"));
		library.add(new Book("å �̸�3","�۾���3"));
		library.add(new Book("å �̸�4","�۾���4"));
		library.add(new Book("å �̸�5","�۾���5"));
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).ShowInfo();
		}

	}

}
