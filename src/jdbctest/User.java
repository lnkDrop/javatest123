package jdbctest;

public class User {
	
	public String name;
	public int age;
	public String password;
	public int id;
	
	public void setUser(int id,String name,int age,String password) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	public void setUser(String name,int age,String password) {
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	
}
