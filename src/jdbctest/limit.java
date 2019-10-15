package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class limit {
	
	public static void list(int start,int count) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/db_java?characterEncoding=UTF-8";
		String user = "root";
		String password = "123456";
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement s = conn.createStatement();
				
		){
			
			String sql = "select * from t_user limit "+start+","+count;
			ResultSet rs = s.executeQuery(sql);
			
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String pw = rs.getString(4);
				System.out.format("%d\t%s\t%d\t%s\n",id,name,age,pw);
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
