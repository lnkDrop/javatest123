package Thread;

import java.util.ArrayList;
import java.util.Random;

public class decodePassword {
	public static void main(String[] args) {
		password p = new password();
		String ps = p.randomString(5);
		char[] gesps = new char[5];
		
		char[] gesps2 = new char[5];
		
		ArrayList<String> pl = p.pwdlist;
		Thread t1 = new Thread() {
			public void run() {
				p.gp(gesps, ps);
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				p.gp2(gesps2, ps);
					}
				
			
		};
		
//		t2.setDaemon(true);
		t2.start();
		
	}
}
