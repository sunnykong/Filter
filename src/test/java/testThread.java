

public class testThread {
	
	static Bussiness bussiness = new Bussiness();
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			public void run() {
				for (int i = 0; i < 10; i++) {
					bussiness.sub(i);
				}
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				for (int i = 0; i < 10; i++) {
					bussiness.main(i);
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				for (int i = 0; i < 10; i++) {
					bussiness.sub2(i);
				}
				
			}
		}).start();
		
	}

}
enum ThreadFlog {
	SUB,SUB2,MAIN
	
}
/**
 * 执行顺序
 * 1-2-main-1-2-main ....
 * @author Administrator
 *
 */
class Bussiness {
	static ThreadFlog threadFlog = ThreadFlog.SUB;
	
	public synchronized void sub(int i) {
		while (!threadFlog.equals(ThreadFlog.SUB)) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int j = 0; j < 10; j++) {
			System.out.println("sub execute sequence of "+j +" loop of " +(i+1));
		}
		threadFlog = ThreadFlog.SUB2;
//		threadFlog = ThreadFlog.MAIN;
		this.notifyAll();
	}
	
	public synchronized void sub2(int i) {
		while (!threadFlog.equals(ThreadFlog.SUB2)) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		for (int j = 0; j < 2; j++) {
			System.out.println("sub2 execute sequence of "+ j +" loop of "+ (i+1));
		}
//		sub = true;
		threadFlog = ThreadFlog.MAIN;
		this.notifyAll();
	}
	
	public synchronized void main(int i) {
		while (!threadFlog.equals(ThreadFlog.MAIN)) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		for (int j = 0; j < 5; j++) {
			System.out.println("main execute sequence of "+ j +" loop of "+ (i+1));
		}
//		sub = true;
		threadFlog = ThreadFlog.SUB;
		this.notifyAll();
	}
}
