package model;

public class Status {
	private String statusCode;
	private String borrower;
	private String bookCode;
	private String date;
	
	public Status() {}

	public Status(String statusCode, String borrower, String bookCode, String date) {
		super();
		this.statusCode = statusCode;
		this.borrower = borrower;
		this.bookCode = bookCode;
		this.date = date;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}
