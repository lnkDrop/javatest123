package Thread;

public class test {
	public static void main(String[] args) {
		Hero liqing = new Hero();
		liqing.name = "李青";
		liqing.hp = 60000;
		liqing.damage = 100;
		
		Hero timo = new Hero();
		timo.name = "提莫";
		timo.hp = 40000;
		timo.damage = 90;
		
		Hero Ez = new Hero();
		Ez.name = "Ez";
		Ez.hp = 45000;
		Ez.damage = 120;
		
		Hero gai = new Hero();
		gai.name = "盖伦";
		gai.hp = 70000;
		gai.damage = 70;

//		继承Thread
//		KillThread k1 = new KillThread(liqing, timo);
//		KillThread k2 = new KillThread(Ez,liqing);
//		k1.start();
//		k2.start();
		
		
//		实现Runnable
//		Thread tr1 = new Thread(new KillRunnble(liqing,timo),"李青出击！");
//		tr1.start();
//		
//		Thread tr2 = new Thread(new KillRunnble(Ez,timo),"Ez出击！");
//		tr2.start();
//		
//		Thread tr3 = new Thread(new KillRunnble(gai,timo),"盖伦出击！");
//		tr3.start();
		
		
//		匿名类
		Thread t1 = new Thread() {
			public void run() {
				while(!timo.isDead()) {
					liqing.attack(timo);
				}
			}
		};
		
		
//		try {
//			t1.join(); //加入到主线程，只有t1.join()运行完才会运行下面的内容
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Thread t2 = new Thread() {
			public void run() {
				while(!Ez.isDead()) {
//					Thread.yield();//临时暂停，使得t1可以占用cpu资源
					gai.attack(Ez);
				}
			}
		};
		
		
//		t1.setPriority(Thread.MAX_PRIORITY);//设置线程优先级
//		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(5);
		t2.setPriority(5);
		t1.start();
		t2.start();
		
		
	}
	
	
}
