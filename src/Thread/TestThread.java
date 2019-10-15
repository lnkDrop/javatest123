package Thread;

public class TestThread {
	public static void main(String[] args) {
		ThreadPool pool = new ThreadPool();
		
		for(int i = 0;i<10;i++) {
			Runnable task = new  Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("XX任务");
				}
			};
			pool.add(task);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
