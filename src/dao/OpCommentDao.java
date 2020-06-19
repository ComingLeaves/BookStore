package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utils.Comment;
import utils.JDBCUtils;

public class OpCommentDao {

	public static boolean AddCom(Comment comment) {
		
		Connection conn=null;
		Statement statement=null;
		try{
			String sql="insert into comments(uid,bid,username,bookname,comment,ctime) values("+comment.getUid()+","+comment.getBid()+",'"+comment.getUsername()+"','"+comment.getBookname()+"','"+comment.getComment()+"','"+comment.getTime()+"')";
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
				conn.close();
				statement.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public static ArrayList<Comment> GetCom() {
		ArrayList<Comment> list=new ArrayList<Comment>();
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		
		
		try{
			String sql="select * from comments";
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			
			while(rSet.next())
			{
				Comment comment=new Comment();
				comment.setCid(rSet.getInt(1));
				comment.setUid(rSet.getInt(2));
				comment.setBid(rSet.getInt(3));
				comment.setUsername(rSet.getString(4));
				comment.setBookname(rSet.getString(5));
				comment.setComment(rSet.getString(6));
				comment.setTime(rSet.getString(7));
				list.add(comment);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				statement.close();
				rSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public static ArrayList<Comment> GetComWithuid(int intValue) {
		ArrayList<Comment> list=new ArrayList<Comment>();
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		
		
		try{
			String sql="select * from comments where uid="+intValue;
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			
			while(rSet.next())
			{
				Comment comment=new Comment();
				comment.setCid(rSet.getInt(1));
				comment.setUid(rSet.getInt(2));
				comment.setBid(rSet.getInt(3));
				comment.setUsername(rSet.getString(4));
				comment.setBookname(rSet.getString(5));
				comment.setComment(rSet.getString(6));
				comment.setTime(rSet.getString(7));
				list.add(comment);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				statement.close();
				rSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public static ArrayList<Comment> GetComWithbid(int intValue) {
		ArrayList<Comment> list=new ArrayList<Comment>();
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		
		
		try{
			String sql="select * from comments where bid="+intValue;
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			
			while(rSet.next())
			{
				Comment comment=new Comment();
				comment.setCid(rSet.getInt(1));
				comment.setUid(rSet.getInt(2));
				comment.setBid(rSet.getInt(3));
				comment.setUsername(rSet.getString(4));
				comment.setBookname(rSet.getString(5));
				comment.setComment(rSet.getString(6));
				comment.setTime(rSet.getString(7));
				list.add(comment);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
				statement.close();
				rSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public static boolean Delcom(int intValue) {
		Connection conn=null;
		Statement statement=null;
		
		try{
			String sql="delete from comments where cid="+intValue;
			
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
				conn.close();
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

}
