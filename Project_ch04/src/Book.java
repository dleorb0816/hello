import java.util.Scanner;

//goods2
public class Book {
	String title;
	String author;
	int ISBN;

	public Book(String title, String author, int ISBN) {//생성자
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
}
	
	public static void main(String[] args) {
		Book javaBook = new Book("Java JDK", "황기태",3333);
	}
}