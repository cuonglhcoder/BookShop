package BooksInfor;

import java.util.Scanner;

public class Books {
	private Integer bookISBN;
	private String bookTitle;
	private String author;
	private String publisher;
	private Integer yearOfManufacture;
	private Double listedPrice;
	private Integer quantity;

	public Books() {
	}

	public Books(Integer bookISBN, String bookTitle, String author, String publisher, Integer yearOfManufacture, Double listedPrice,
			Integer quantity) {
		this.bookISBN = bookISBN;
		this.bookTitle = bookTitle;
		this.author = author;
		this.publisher = publisher;
		this.yearOfManufacture = yearOfManufacture;
		this.listedPrice = listedPrice;
		this.quantity = quantity;

	}

	public Integer getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(Scanner scanner) {
		System.out.print("Enter ISBN: ");
		this.bookISBN = scanner.nextInt();
		scanner.nextLine();
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(Scanner scanner) {
		System.out.print("Enter Book Title: ");
		this.bookTitle = scanner.nextLine();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(Scanner scanner) {
		System.out.print("Enter Publisher: ");
		this.publisher = scanner.nextLine();
	}

	public Integer getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(Scanner scanner) {
		System.out.print("Enter Year Of Manufature: ");
		this.yearOfManufacture = scanner.nextInt();
		scanner.nextLine();
	}

	public Double getListedPrice() {
		return listedPrice;
	}

	public void setListedPrice(Scanner scanner) {
		System.out.print("Enter Listed Price: ");
		this.listedPrice = scanner.nextDouble();
		scanner.nextLine();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Scanner scanner) {
		System.out.print("Enter Quantity: ");
		this.quantity = scanner.nextInt();
		scanner.nextLine();
	}

	@Override
	public String toString() {
		return bookISBN + "\t"+ bookTitle + "\t" +author+ "\t" + publisher
				+ "\t" + yearOfManufacture + "\t" + listedPrice + "\t" + quantity+"\n";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(Scanner scanner) {
		System.out.print("Enter Author: ");
		this.author = scanner.nextLine();
	}
	
	

}
