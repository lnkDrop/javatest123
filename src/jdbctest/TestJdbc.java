package jdbctest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;




public class TestJdbc {
	//
	public static List<User> list(){
		User u = null;
		List<User> us = new ArrayList<User>();
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
			
			String sql = "select * from t_user";
			ResultSet rs = s.executeQuery(sql);
			
			while(rs.next()) {
				u = new User();
				String name = rs.getString(2);
				int age = rs.getInt(3);
				u.name = name;
				u.age = age;
				us.add(u);
			}
		
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	
		
	}
	public static void update(int id,String name,int age,String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "update t_user set username=?,age=?,password=md5(?) where id=?";
		
		try (		
				
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_java?characterEncoding=UTF-8","root","123456");
				PreparedStatement s = c.prepareStatement(sql);
				)
		{	
			s.setString(1, name);
			s.setInt(2, age);
			s.setString(3, password);
			s.setInt(4, id);
			s.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void delete(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "delete from t_user where id="+id;
		
		try (		
				
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_java?characterEncoding=UTF-8","root","123456");
				PreparedStatement s = c.prepareStatement(sql);
				)
		{
			s.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void insert(String name,int age,String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "insert into t_user values(null,?,?,md5(?))";
		
		try (		
				
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_java?characterEncoding=UTF-8","root","123456");
				PreparedStatement s = c.prepareStatement(sql);
				)
		{
			
			s.setString(1, name);
			s.setInt(2, age);
			s.setString(3, password);
			s.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static User get(int id) {
		User u = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/db_java?characterEncoding=UTF-8";
		String user = "root";
		String password = "123456";
//		String sql = "insert into t_user values(null,?,?,md5(?))";
		
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement s = conn.createStatement();
//			PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		){
			
			String sql = "select * from t_user where id = "+id;
			ResultSet rs = s.executeQuery(sql);
			if(rs.next()) {
				u = new User();
				String name = rs.getString(2);
				int age = rs.getInt(3);
				u.name = name;
				u.age = age;
			}
			
			
			
//			conn.setAutoCommit(true);
//			String sql1 = "update t_user set age=age-1 where id=122";
//			s.execute(sql1);
//			
//			String sql2 = "updata t_user set age=age+1 where id=122";
//			s.execute(sql2);
//			
//			conn.commit();
//			ps.setString(1, "独尊");
//			ps.setInt(2, 40);
//			ps.setString(3,"888888");
//			
//			ps.execute();
//			
//			ResultSet rs = ps.getGeneratedKeys();
//			if(rs.next()) {
//				
//				int id = rs.getInt(1);
//				int i = 1;
//				while(true) {
//					String sql2 = "select id from t_user where id="+(id-i)+"";
//					
//					ResultSet rs2 = ps.executeQuery(sql2);
//					if(rs2.next()) {
//						String del = "delete from t_user where id="+(id-i)+"";
//						ps.execute(del);
//						break;
//					}else {
//						i++;
//						continue;
//					}
//				}
//			
//			}
//			
//			InputStreamReader in = new InputStreamReader(System.in);
//			BufferedReader bf = new BufferedReader(in);
//			System.out.println("输入用户");
//			String input1 = bf.readLine();
//			System.out.println("输入密码");
//			String input2 = bf.readLine();
			
//			for(int i = 1;i<=100;i++) {
//				String sql = String.format("insert into t_user values(null,'%s',%d,md5(%d))", 
//						"admin"+i,18,123456);
//				s.execute(sql);
//				
//			}
			
			
//			String sql = "select * from t_user limit 20";
//			ResultSet rs = s.executeQuery(sql);
//			
//			
//			while(rs.next()) {
//				int id = rs.getInt(1);
//				String name = rs.getString(2);
//				int age = rs.getInt(3);
//				String pw = rs.getString(4);
//				System.out.format("%d\t%s\t%d\t%s\n",id,name,age,pw);
//			}
			
//			String sql = "select * from t_user where username = '"+input1+"' and password = md5('"+input2+"')";
//			ResultSet rs = s.executeQuery(sql);
//			if(rs.next()) {
//				System.out.println("yes");
//			}else {
//				System.out.println("no");
//			}
			
			
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	
}

