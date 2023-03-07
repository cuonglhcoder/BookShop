package Test;

import java.util.Scanner;

import javax.swing.colorchooser.AbstractColorChooserPanel;

import BookDAO.BookInterface;
import BookDAO.BooksImpliment;

public class Test {
	BookInterface booksImpliment = new BooksImpliment();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test test = new Test();
		int x = 0;
		do {
			x = Choosen();
			if(x==1) {
				test.booksImpliment.InsertBooksIntoQSL(scanner);
			}else if(x==2) {
				test.booksImpliment.SelectBooksFromSQL();
			}else if(x==3) {
				test.booksImpliment.DeleteAllBooks();
			}else if(x==4) {
				System.out.println("Program is closed !");
				return;
			}
			else {
				Choosen();
			}
		} while (x!=0);
		
	}

	public static int Choosen() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ");
		System.out.println(
				"------ Choose function ------\n" + 
						"1. Add new book\n" + 
						"2. View all books\n" + 
						"3. Remove all books\n" + 
						"4. Close program");
		System.out.print("Please enter your choose: ");
		int choose = scanner.nextInt();
		System.out.println(" ");
		return choose;

	}

}
