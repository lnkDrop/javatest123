package Thread;

public class test2 {
public static void main(String[] args) {
	Thread t1 = new Thread() {
	
		public void run() {
			
			while(true) {
				int s = 1;
				while(s<=3) {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.printf("使用波动拳%d次%n",s++);
					}
				
				try {
					System.out.println("开始为时5秒的充能");
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		
	};
	
//	t1.setDaemon(true);
	t1.start();
	}
}
