package utils;

public class Comment {
    
	private int cid;
	private int uid;
	private int bid;
	private String username;
	private String bookname;
	private String comment;
	private String time;
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(int cid, int uid, int bid, String username, String bookname,
			String comment, String time) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.bid = bid;
		this.username = username;
		this.bookname = bookname;
		this.comment = comment;
		this.time = time;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Comment [username=" + username + ", bookname=" + bookname
				+ ", comment=" + comment + "]";
	}
	
	
}
