package test;

public class Pertest {
	public static void main(String[] args) {
		Per p = new Per(18,"小明");
//		p.setAge(10);
		int a = p.getAge();
		String name = p.getName();
		System.out.println(name +"  年龄："+a);
	}
}
