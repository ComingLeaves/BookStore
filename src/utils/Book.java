package utils;

public class Book {

	private int  boobid;
	private String  bookname;
	private String  bookpic;
	private int  pnum;
	private String  price;
	private String  author;
	private String  category;
	private String  description;
	private String  pubdate;
	public Book(String bookname, String bookpic, int pnum, String price,
			String author, String category, String description, String pubdate) {
		super();
		this.bookname = bookname;
		this.bookpic = bookpic;
		this.pnum = pnum;
		this.price = price;
		this.author = author;
		this.category = category;
		this.description = description;
		this.pubdate = pubdate;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBoobid() {
		return boobid;
	}
	public void setBoobid(int boobid) {
		this.boobid = boobid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookpic() {
		return bookpic;
	}
	public void setBookpic(String bookpic) {
		this.bookpic = bookpic;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + "]";
	}
	
}
