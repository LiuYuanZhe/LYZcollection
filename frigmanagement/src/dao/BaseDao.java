package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BaseDao {
	public static String url = "jdbc:sqlserver://localhost:1433;databaseName=frigmanagement";
	public static String username = "sa";
	public static String pwd = "123456";
	public static String drivername = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static Connection conn = null;
	public static PreparedStatement ps = null;
	public static ResultSet rs = null;
	public Connection getConnection(){
		try {
			Class.forName(drivername);
			conn = DriverManager.getConnection(url, username, pwd);
			System.out.println("连接成功");
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("连接失败");
			return null;
		}
		
	}
	public void closeAll(){
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public int executeAllsql(List<Object> list , String sql ){
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < list.size(); i++) {
				ps.setObject(i+1, list.get(i));
			}
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}finally{
			closeAll();
		}
	}
}
