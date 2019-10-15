package jdbctest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDao implements Dao {
	
	public UserDao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getconnection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_java?characterEncoding=UTF-8",
				"root",
				"123456");
		
	}
	
	public int getTotal() {
		int total = 0;
		try (Connection c = getconnection();
				Statement s = c.createStatement();)
		{
			String sql = "select * from t_user";
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				total++;
			}
			System.out.println("共"+total+"条数据");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}
	
	
	@Override
	public void add() {
		String sql = "insert into t_user values(null,?,?,md5(?))";
		try (Connection c = getconnection();
				PreparedStatement p = c.prepareStatement(sql))
			{
			User user = new User();
			Scanner sc = new Scanner(System.in);
			System.out.println("添加-请输入用户名:");
			String name = sc.nextLine();
			
			System.out.println("添加-请输入密码:");
			String ps = sc.nextLine();
			
			System.out.println("添加-请输入年龄:");
			int age = sc.nextInt();
			
			if(name.equals(null)||ps.equals(null)||age>0) {
				System.out.format("%s\t%d\t%s\t",name,age,ps);
				user.setUser(name, age, ps);
				p.setString(1, user.name);
				p.setInt(2, user.age);
				p.setString(3, user.password);
				p.execute();
				System.out.println("添加成功!");
			}else {
				System.out.println("输入不合法!");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	
	@Override
	public void update() {
		String sql = "update t_user set username= ?, age = ? , password = md5(?) where id = ?";
		
		try 
			(
					Connection c = getconnection();PreparedStatement p = c.prepareStatement(sql);
				)
			{
			User user = new User();
			Scanner sc = new Scanner(System.in);
			System.out.println("修改-请输入要修改的用户id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("修改-请输入用户名:");
			String name = sc.nextLine();
			
			System.out.println("修改-请输入密码:");
			String ps = sc.nextLine();
			
			System.out.println("修改-请输入年龄:");
			int age = sc.nextInt();
			
			
			if(name.equals(null)||ps.equals(null)||age>0) {
				user.setUser(id, name, age, ps);
				System.out.format("%s\t%d\t%s\t",name,age,ps);
				p.setString(1, user.name);
				p.setInt(2, user.age);
				p.setString(3, user.password);
				p.setInt(4, user.id);
				p.execute();
				System.out.println("修改成功!");
			}else {
				System.out.println("输入不合法!");
			}
			
			
			
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String sql = "delete from t_user where id="+id;
		try (Connection c = getconnection();
				Statement s = c.createStatement();)
		{
			
			s.execute(sql);
			System.out.println("删除成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public User get(int id) {
		User user = null;
		
		try (
				Connection c = getconnection();
				Statement s = c.createStatement();
				
				)
		{
			String sql = "select * from t_user where id= "+id;
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				user = new User();
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String password = rs.getString(4);
				user.setUser(name, age, password);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public List<User> list() {
		List<User> u = new ArrayList<User>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (Connection c = getconnection();
				Statement s = c.createStatement();
				)
		{
			String sql = "select * from t_user";
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				User user = new User();
				int id  = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String password = rs.getString(4);
				user.setUser(id, name, age, password);
				u.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public List<User> list(int start, int count) {
		List<User> u = new ArrayList<User>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "select * from t_user limit ?,?";

		try(Connection c = getconnection();
				PreparedStatement ps = c.prepareStatement(sql);)
		{
			ps.setInt(1, start);
			ps.setInt(2, count);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User user = new User();
				int id  = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String password = rs.getString(4);
				user.setUser(id, name, age, password);
				u.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}
	
}
