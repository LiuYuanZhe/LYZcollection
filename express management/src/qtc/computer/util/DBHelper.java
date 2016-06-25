package qtc.computer.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/goodsdbms";
	private static String user = "root";
	private static String password = "mysql";
	
	
	public static Connection getConnection(){
		
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return conn;
	}
	
	

	
	
//	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=goodsDBMS;";
//	private static String user = "sa";
//	private static String password = "123456";
	
//	public static Connection getConnection() throws SQLException{
//		try{
//			Class.forName(driver);
//			
//		}catch(Exception e){
//			System.out.println("���������");
//		}
//		Connection conn = (Connection)DriverManager.getConnection(url,user,password);
//		return conn;
//	}

}
