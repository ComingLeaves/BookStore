package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCUtils {
	private static JDBCUtils instance = new JDBCUtils();
	public static final String URL = "jdbc:sqlserver://DESKTOP-S4HABGL\\SQLEXPRESS:1433;databaseName=BookStore";
	public static final String USER = "sa";
	public static final String PASSWORD = "123456";
	public static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private JDBCUtils() {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private Connection createConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
//			System.out.println("Connection succesful");
		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database.");
		}
		return connection;
	}

	public static Connection getConnection() {
		return instance.createConnection();
	} 
	
	public static void Close(Connection conn,Statement st) throws SQLException
	{
		if(conn!=null)
		{
			conn.close();
		}
		if(st!=null)
		{
			st.close();
		}
	}
	public static void Close(Connection conn,Statement st,ResultSet rs) throws SQLException
	{
		Close(conn, st);
		if(rs!=null)
		{
			rs.close();
		}
		
	}
}
