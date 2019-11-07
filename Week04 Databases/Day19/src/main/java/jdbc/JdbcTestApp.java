package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JdbcTestApp {

	public static void main(String[] args) {
		Connection conn = null;
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("jdbc.properties"));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String dburl = props.getProperty("dburl");
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		
		try {
			conn = (Connection) DriverManager.getConnection(dburl, username, password);
			if(conn != null) {
				System.out.println("mysql connection successfully acquired");
			}
			String sql = "select * from cities";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			rs.close();
			conn.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
