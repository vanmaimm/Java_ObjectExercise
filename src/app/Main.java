package app;

import function.BookFunction;

public class Main {
		public static void main(String[] args) {
			BookFunction bookFunction = new BookFunction();	
			bookFunction.bookData();
			bookFunction.displayAllBook();
			bookFunction.remainingBooks();
	}
}
