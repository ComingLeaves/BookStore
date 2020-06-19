package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utils.JDBCUtils;
import utils.order;
import utils.item;

public class OpOderDao {

	public static ArrayList<order> GetOders() {
		
		ArrayList<order> orders=new ArrayList<order>();
		
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		
		try{
			String sql="select * from orderss ";
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			while(rSet.next())
			{
				order or=new order();
				or.setOid(rSet.getString(1));
				or.setUid(rSet.getInt(2));
				or.setTotalprice(rSet.getString(3));
				or.setReceiverName(rSet.getString(4));
				or.setReceiverAddress(rSet.getString(5));
				or.setReceiverPhone(rSet.getString(6));
				or.setOrdertime(rSet.getString(7));
				or.setPaytime(rSet.getString(8));
				or.setOrderstate(rSet.getString(9));
				orders.add(or);
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
		return orders;
	}

	public static order GetOrder(String oid) {
		
		order or=new order();
		
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		ResultSet rSet2=null;
		
		try{
			String sql="select * from orderss where oid='"+oid+"'";
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			rSet=statement.executeQuery(sql);
			if(rSet.next())
			{
				
				or.setOid(rSet.getString(1));
				or.setUid(rSet.getInt(2));
				or.setTotalprice(rSet.getString(3));
				or.setReceiverName(rSet.getString(4));
				or.setReceiverAddress(rSet.getString(5));
				or.setReceiverPhone(rSet.getString(6));
				or.setOrdertime(rSet.getString(7));
				or.setPaytime(rSet.getString(8));
				or.setOrderstate(rSet.getString(9));
			}
			
			
				String sql2="select * from items where oid='"+oid+"'";
				rSet2=statement.executeQuery(sql2);
				ArrayList<item> orderitems=new ArrayList<item>();
				while(rSet2.next())
				{
					item orderitem=new item();
					orderitem.setId(rSet2.getInt(1));
					orderitem.setOid(rSet2.getString(2));
					orderitem.setSid(rSet2.getInt(3));
					orderitem.setBookid(rSet2.getInt(4));
					orderitem.setBuynum(rSet2.getString(5));
					orderitem.setBookname(rSet2.getString(6));
					orderitem.setBookpic(rSet2.getString(7));
					orderitem.setPrice(rSet2.getString(8).trim());
					orderitems.add(orderitem);
				}
				or.setList(orderitems);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtils.Close(conn, statement, rSet);
				JDBCUtils.Close(conn, statement, rSet2);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return or;
	}

	public static boolean DelOrder(String oid) {
		Connection conn=null;
		Statement statement=null;
		
		try{
			String sql="delete from orderss where oid='"+oid+"'";
			String sql2="delete from items where oid='"+oid+"'";
			conn=JDBCUtils.getConnection();
			statement=conn.createStatement();
			int row=statement.executeUpdate(sql);
			statement.executeUpdate(sql2);
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
	
}
