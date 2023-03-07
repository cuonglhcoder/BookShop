package BookDAO;

import java.util.Scanner;
import java.util.List;

import BooksInfor.Books;

public interface BookInterface {

	public Books InsertBooksIntoQSL(Scanner scanner);

	public List<Books> SelectBooksFromSQL();

	public int DeleteBooks();
	
	public void DeleteAllBooks();

	public boolean UpdateBooks();

}
