package utils;

public class item {

	private int id;
	private String oid;
	private int bookid;
	private int sid;
	private String buynum;
	private String bookname;
	private String price;
	private String bookpic;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOid() {
		return oid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBuynum() {
		return buynum;
	}
	public void setBuynum(String buynum) {
		this.buynum = buynum;
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
	@Override
	public String toString() {
		return "orderitem [bookname=" + bookname + "]";
	}
	
	
}
