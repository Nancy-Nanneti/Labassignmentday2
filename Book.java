package day2labassignment;

public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOffCopies;
	public Book(String bookTitle,String author, String ISBN, int numOffCopies){
		this.bookTitle=bookTitle;
		this.author=author;
		this.ISBN=ISBN;
		this.numOffCopies=numOffCopies;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public String getISBN() {
		return ISBN;
	}
	public int getNumOffCopies() {
		return numOffCopies;
	}
	public void setNumOffCopies(int numOffCopies) {
		this.numOffCopies = numOffCopies;
	}
	void display() {
		System.out.println(bookTitle);
		System.out.println(author);
		System.out.println(ISBN);
		System.out.println(numOffCopies);
	}
	}
