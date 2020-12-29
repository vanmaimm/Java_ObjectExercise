package function;

import data.BookData;
import model.Book;

public class BookFunction {
	public void bookData() {
		BookData.bookList.add(new Book(BookData.bookList.size(),"Book 1", 10, 6));
		BookData.bookList.add(new Book(BookData.bookList.size(),"Book 2", 13, 6));
		BookData.bookList.add(new Book(BookData.bookList.size(),"Book 3", 9, 5));
		BookData.bookList.add(new Book(BookData.bookList.size(),"Book 4", 87, 4));
		BookData.bookList.add(new Book(BookData.bookList.size(),"Book 5", 12,10));
	}
	public void displayAllBook() {
		for (int i = 0; i < BookData.bookList.size(); i++) {
			System.out.println(BookData.bookList.get(i).toString());
		}
	}
	
	public void remainingBooks() {
		for (int i = 0; i < BookData.bookList.size(); i++) {
			System.out.println(BookData.bookList.get(i).getName()+ "| Remaining Book: " +  (BookData.bookList.get(i).getQuantity() - BookData.bookList.get(i).getLendQuantity()));
		}
	}
}
