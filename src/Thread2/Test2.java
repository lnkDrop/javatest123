package Thread2;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import Thread.ThreadPool;
import Thread.password;

public class Test2 {
public static void main(String[] args) {
	password p = new password();
	ThreadPoolExecutor tp  = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
	String ps = p.randomString(3);
	char[] gesps = new char[3];
	tp.execute(new Runnable() {
	
	@Override
	public void run() {
		p.gp(gesps, ps);
		System.out.println("任务1");
		
	}
});

tp.execute(new Runnable() {
	
	@Override
	public void run() {
		p.gp(gesps, ps);
		System.out.println("任务2");
		
	}
});
}
}
