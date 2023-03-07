package BookDAO;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import BooksInfor.Books;
import UtilsBooks.UtilsBooks;

public class BooksImpliment implements BookInterface {

	@Override
	public List<Books> SelectBooksFromSQL() {
		List<Books> booksList = new ArrayList<>();
		Connection conn = UtilsBooks.getConnection();

		try {
			Statement stm = conn.createStatement();
			String stmString = "SELECT * FROM BookData";
			ResultSet resultSet = stm.executeQuery(stmString);

			while (resultSet.next()) {
				Integer bookISBN = resultSet.getInt(1);
				String bookTitle = resultSet.getString(2);
				String author = resultSet.getString(3);
				String publisher = resultSet.getString(4);
				Integer yearOfManufacture = resultSet.getInt(5);
				Double listedPrice = resultSet.getDouble(6);
				Integer quantity = resultSet.getInt(7);

				Books book = new Books(bookISBN, bookTitle, author, publisher, yearOfManufacture, listedPrice,
						quantity);
				booksList.add(book);

			}

			for (Books bo : booksList) {
				System.out.println(bo.toString());
			}
			conn.close();
			return booksList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int DeleteBooks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean UpdateBooks() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Books InsertBooksIntoQSL(Scanner scanner) {

		Books books = new Books();
		books.setBookISBN(scanner);
		books.setBookTitle(scanner);
		books.setAuthor(scanner);
		books.setPublisher(scanner);
		books.setYearOfManufacture(scanner);
		books.setListedPrice(scanner);
		books.setQuantity(scanner);

		Connection connection = UtilsBooks.getConnection();
		String sqlString = "INSERT INTO BookData VALUES (?,?,?,?,?,?,?)";

		try {
			PreparedStatement pst = connection.prepareStatement(sqlString);

			pst.setInt(1, books.getBookISBN());
			pst.setString(2, books.getBookTitle());
			pst.setString(3, books.getAuthor());
			pst.setString(4, books.getPublisher());
			pst.setInt(5, books.getYearOfManufacture());
			pst.setDouble(6, books.getListedPrice());
			pst.setInt(7, books.getQuantity());

			int row = pst.executeUpdate();
			if (row > 0) {
				System.out.println("Insert successful !");
			}
			pst.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return books;
	}

	@Override
	public void DeleteAllBooks() {
		Connection conn = UtilsBooks.getConnection();
		String stmString = "TRUNCATE TABLE BookData";
		try {
			Statement stm = conn.createStatement();
			stm.executeUpdate(stmString);

			stm.close();
			conn.close();
			System.out.println("All books are removed");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
