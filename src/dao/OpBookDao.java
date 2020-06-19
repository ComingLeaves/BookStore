package dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import utils.Book;
import utils.JDBCUtils;
import utils.User;


@SuppressWarnings("unused")
public class OpBookDao {

	public static Book GetBookDetils(int bid) {
		Book book=null;
		
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		
		
		try{
			String sql="select * from books where bookid="+bid;
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			book=new Book();
			if(rSet.next())
			{
				book.setBoobid(rSet.getInt(1));
				book.setBookname(rSet.getString(2));
				book.setPrice(rSet.getString(3));
				book.setCategory(rSet.getString(4));
				book.setPnum(rSet.getInt(5));
				book.setBookpic(rSet.getString(6));
				book.setDescription(rSet.getString(7));
				book.setAuthor(rSet.getString(8));
				book.setPubdate(rSet.getString(9));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtils.Close(conn, statement, rSet);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return book;
	}

	public static ArrayList<Book> GetCatagoryBook(String catagory,int page) {
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		ArrayList<Book> list=new ArrayList<Book>();
		int start=(page-1)*20;
		int i=0;
		int end=page*20;
		
		try{
			String sql="select * from books where category='"+catagory+"'";
			
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			
			while(rSet.next())
			{
				if(i<start)
				{
					i++;
					continue;
				}
				else if(i>end){
					break;
				}
				else{
					Book book=new Book();
					book.setBoobid(rSet.getInt(1));
					book.setBookname(rSet.getString(2));
					book.setPrice(rSet.getString(3));
					book.setCategory(rSet.getString(4));
					book.setPnum(rSet.getInt(5));
					book.setBookpic(rSet.getString(6));
					book.setDescription(rSet.getString(7));
					book.setAuthor(rSet.getString(8));
					book.setPubdate(rSet.getString(9));
					list.add(book);
					i++;
				}
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtils.Close(conn, statement, rSet);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public static ArrayList<Book> GetBook(int page) {
		
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		ArrayList<Book> list=new ArrayList<Book>();
		int start=(page-1)*20;
		int i=0;
		int end=page*20;
		
		try{
			String sql="select * from books";
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			
			while(rSet.next())
			{
				if(i<start)
				{
					i++;
					continue;
				}
				else if(i>end){
					break;
				}
				Book book=new Book();
				book.setBoobid(rSet.getInt(1));
				book.setBookname(rSet.getString(2));
				book.setPrice(rSet.getString(3));
				book.setCategory(rSet.getString(4));
				book.setPnum(rSet.getInt(5));
				book.setBookpic(rSet.getString(6));
				book.setDescription(rSet.getString(7));
				book.setAuthor(rSet.getString(8));
				book.setPubdate(rSet.getString(9));
				list.add(book);
				i++;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtils.Close(conn, statement, rSet);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public static boolean AddBook(Book book) {
		Connection conn=null;
		Statement statement=null;
		
		try{
			String sql="insert into books(bookname,price,category,pnum,imgurl,description,author,pubdate) ";
			sql+="values('"+book.getBookname()+"','"+book.getPrice()+"','"+book.getCategory()+"',"+book.getPnum()+",'"+book.getBookpic()+"','"+book.getDescription()+"','"+book.getAuthor()+"','"+book.getPubdate()+"')";
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			int row=statement.executeUpdate(sql);
			if(row!=0)
			{
				return true;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtils.Close(conn, statement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}

	public static boolean DeleteBook(int bid) {
		
		Connection conn=null;
		Statement statement=null;
		
		try{
			String sql="delete from books where bookid="+bid;
			
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			int row=statement.executeUpdate(sql);
			if(row!=0)
			{
				return true;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtils.Close(conn, statement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public static boolean UpBook(Book book) {

		Connection conn=null;
		Statement statement=null;
		
		try{
			String sql="update books set bookname='"+book.getBookname()+"',price='"+book.getPrice()+"',pnum="+book.getPnum()+",category='"+book.getCategory()+"',imgurl='"+book.getBookpic()+"',description='"+book.getDescription()+"',author='"+book.getAuthor()+"',pubdate='"+book.getPubdate()+"' where bookid="+book.getBoobid();
			System.out.println(sql);
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			int row=statement.executeUpdate(sql);
			if(row!=0)
			{
				return true;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtils.Close(conn, statement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public static ArrayList<Book> GetRecomBook() {
		
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		ArrayList<Book> list=new ArrayList<Book>();
		ArrayList<Integer> ilist=new ArrayList<Integer>();
		Random random=new Random();
		for(int i=0;i<8;i++)
		{
			int j=random.nextInt(1000);
			if(ilist.contains(j))
			{
				i--;
				continue;
			}
			ilist.add(j);
		}
		try{
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			for(int i=0;i<ilist.size();i++){
			String sql="select * from books where bookid="+ilist.get(i);
			rSet=statement.executeQuery(sql);
			
				if(rSet.next())
				{
					Book book=new Book();
					book.setBoobid(rSet.getInt(1));
					book.setBookname(rSet.getString(2));
					book.setPrice(rSet.getString(3));
					book.setCategory(rSet.getString(4));
					book.setPnum(rSet.getInt(5));
					book.setBookpic(rSet.getString(6));
					book.setDescription(rSet.getString(7));
					book.setAuthor(rSet.getString(8));
					book.setPubdate(rSet.getString(9));
					list.add(book);
				}
				else {
					while(true)
					{
						int j=random.nextInt(1000);
						if(!ilist.contains(j))
						{
							ilist.add(j);
							i--;
							break;
						}
						
					}
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtils.Close(conn, statement, rSet);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
}
