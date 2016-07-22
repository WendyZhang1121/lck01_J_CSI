package lck01_J_CSI;

public class TestThread implements Runnable{
	
	int lock = 0;
	private final Integer Lock = new Integer(lock);

	public void run() {
		synchronized (Lock) {
			// ... 
			}
	}
	
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}

}
