package jdbctest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
//		limit lm = new limit();
//		int k = 1;
//		for(int i=0;i<100;i+=5) {
//			
//			System.out.println("第"+(k)+"页");
//			limit.list(i,5);
//			k++;
		
//		TestJdbc t = new TestJdbc();
//		User u = t.get(122);
//		System.out.println(u.name+"    "+u.age); 
//		t.insert("kkp", 22, "987654"); 
//		t.delete(123);
//		t.update(122, "badguy", 16, "123456");
//		List<User> us = t.list();
//		for(User n:us) {
//			System.out.println(n.name);
//		}
		UserDao u = new UserDao();
		List<User> us = new ArrayList<User>();  
		
//		u.add();
//		u.update();
//		u.delete(130);
//		User us = u.get(132);
//		System.out.format("%s\t%d\t%s\t",us.name,us.age,us.password);
		us = u.list(10,10);
		
		for(User n : us) {
			System.out.println(n.name);
		}
		u.getTotal();	
	}
		
		
	
}
