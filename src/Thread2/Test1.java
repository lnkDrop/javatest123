package Thread2;

public class Test1 {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name="盖伦";
		h1.hp = 100;
		h1.damage = 50;
		System.out.println("盖伦的初始血量是"+h1.hp);
		
		int n = 10000;
		Thread[] addts1 = new Thread[n] ;
		Thread[] addts2  = new Thread[n];
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while(true) {
					h1.hurt();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		t1.start();
		
		Thread t12 = new Thread() {
			@Override
			public void run() {
				while(true) {
					h1.hurt();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		t12.start();
		
		Thread t13 = new Thread() {
			@Override
			public void run() {
				while(true) {
					h1.hurt();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		t13.start();
		
		
		
		
		
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				while(true) {
					h1.recover();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
		
		Thread t22 = new Thread() {
			@Override
			public void run() {
				while(true) {
					h1.recover();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t22.start();
		Thread t23 = new Thread() {
			@Override
			public void run() {
				while(true) {
					h1.recover();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t23.start();
		Thread t24 = new Thread() {
			@Override
			public void run() {
				while(true) {
					h1.recover();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t24.start();
		
		Thread t25 = new Thread() {
			@Override
			public void run() {
				while(true) {
					h1.recover();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t25.start();
		
		
		
//		for(Thread t : addts1) {
//			try {
//				t.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		}
//		
//		for(Thread t : addts2) {
//			try {
//				t.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.printf("%d个增加线程和%d个减少的线程结束后,盖伦的血量为 %d\n",n,n,h1.hp);
	}
	
	
	
	
}
