package model;

public class Book {
	private String code;
	private String name;
	private String genre;
	private String creator;
	private int stock;
	
	public Book() {}

	public Book(String code, String name, String genre, String creator, int stock) {
		this.code = code;
		this.name = name;
		this.genre = genre;
		this.creator = creator;
		this.stock = stock;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
