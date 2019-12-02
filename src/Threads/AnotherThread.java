package Threads;

public class AnotherThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello from another thread.");
	
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println("another thread woke me up");
		}
	
		System.out.println("Three seconds has passed");
	}
}
