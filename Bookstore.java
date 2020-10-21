package day2labassignment;

//import day2labassignment.Book;

	public class Bookstore {

		private Book books[];
		private static int maxDiff;

		public Bookstore() {
			maxDiff = 10;
			books = new Book[maxDiff];
		}
		
		public Bookstore(Book[] books) {
			super();
			this.books = books;
		}

		public void sellBook(String bookTitle, int numOfCopies) {
			int index = -1;
			for (int i = 0; i < books.length; i++) {
				if (bookTitle.equalsIgnoreCase(books[i].getBookTitle()) && books[i].getNumOffCopies()!=0 && numOfCopies <= books[i].getNumOffCopies())
				{
					int copies = books[i].getNumOffCopies() - numOfCopies;
					books[i].setNumOffCopies(copies);
					index  = i;
				}
			}
			if( index != -1) {
				System.out.println("Remaining copies of java book");
				books[index].display();
			} else {
				System.out.println("Book not found or No sufficient books");
			}
		}
		
		public void orderBooks(String iSBN, int numOfCopies) {
			int index = -1;
			for(int i=0; i<books.length; i++) {
				if(iSBN.equals(books[i].getISBN()) ) {
					books[i].setNumOffCopies(books[i].getNumOffCopies() + numOfCopies);
					index = i;
				}
			}
			if(index != -1) {
				System.out.println("Added books to the system");
			} else {
				System.out.println("Book was not found Order new book");
			}
		}
		
		public void printBookDetails() {
			for (int i = 0; i < books.length; i++) {
				books[i].display();
			}
		}
	}
