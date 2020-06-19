package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.JDBCUtils;
import utils.User;

public class LRDao {

	public static int Login(String username, String password) {
		
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		
		try{
			String sql="select * from userinfo where username='"+username+"' and password='"+password+"'";
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			
			if(rSet.next())
			{
				return rSet.getInt(1);
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
		return -1;
	}

	public static boolean Register(User user) {
		
		Connection conn=null;
		Statement statement=null;
		try{
			String sql="insert into userinfo(username,password,gender,telephone,address,birthday,authority) values('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getGender()+"','"+user.getTelephone()+"','"+user.getAddress()+"','"+user.getBirthday()+"','"+user.getAuthority()+"')";
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
      
}
