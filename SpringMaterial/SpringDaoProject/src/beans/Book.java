package beans;

public class Book {

	private int ISBN;
	private String title;
	private String author;
	private int pages;
	private float cost;
	private String pub;
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public Book(int iSBN, String title, String author, int pages, float cost, String pub) {
	
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.cost = cost;
		this.pub = pub;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

}
