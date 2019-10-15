package test;

public class Per {
	
	private int age;
	private String name;
	public  Per(int age,String name) {
		this.age = age;
		this.name ="xiaoming";
	}
	public void setAge(int x) {
		if(x>=0&&x<130) {
			age = x;
		}else {
			System.out.println("错误，请输入合法年龄(1-130岁)");
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
	public String  getName() {
		return name;
	}
}
