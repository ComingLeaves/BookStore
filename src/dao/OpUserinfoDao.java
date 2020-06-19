package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utils.JDBCUtils;
import utils.User;

public class OpUserinfoDao {

	public static User getinfo(int uid) {
		
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		User user=new User();
		
		try{
			String sql="select * from userinfo where uid="+uid;
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			
			if(rSet.next())
			{
				user.setUid(rSet.getInt(1));
				user.setUsername(rSet.getString(2));
				user.setPassword(rSet.getString(3));
				user.setGender(rSet.getString(4));
				user.setTelephone(rSet.getString(5));
				user.setAddress(rSet.getString(6));
				user.setBirthday(rSet.getString(7));
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
		return user;
	}

	public static boolean upDatainfo(User user) {

		Connection conn=null;
		Statement statement=null;

		
		try{
			String sql="update userinfo set password='"+user.getPassword()+"',gender='"+user.getGender()+"',username='"+user.getUsername()+"',telephone='"+user.getTelephone()+"',address='"+user.getAddress()+"',birthday='"+user.getBirthday()+"' where uid="+user.getUid();
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

	public static ArrayList<User> GetUsers() {
		ArrayList<User> users=new ArrayList<User>();
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		
		
		try{
			String sql="select * from userinfo";
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			
			while(rSet.next())
			{
				
				User user=new User();
				user.setUid(rSet.getInt(1));
				user.setUsername(rSet.getString(2));
				user.setPassword(rSet.getString(3));
				user.setGender(rSet.getString(4));
				user.setTelephone(rSet.getString(5));
				user.setAddress(rSet.getString(6));
				user.setBirthday(rSet.getString(7));
				users.add(user);
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
		return users;
	}

	public static boolean ModifyPass(String uid, String pw) {

		Connection conn=null;
		Statement statement=null;

		
		try{
			String sql="update userinfo set password='"+pw+"' where uid="+uid;
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
