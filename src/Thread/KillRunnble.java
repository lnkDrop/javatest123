package Thread;

public class KillRunnble implements Runnable{
	
	private Hero h1;
	private Hero h2;
	
	
	public KillRunnble(Hero h1, Hero h2) {
	
		this.h1 = h1;
		this.h2 = h2;
	}


	public void run() {
		while(!h2.isDead()) {
			System.out.println("线程"+Thread.currentThread().getName()+"开始启动");
			h1.attack(h2);
		}
	}
}
