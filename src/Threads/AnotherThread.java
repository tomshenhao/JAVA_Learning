package Threads;

public class AnotherThread extends Thread {
	
	@Override
	public void run() {
		System.out.println(ThreadColor.ANSI_BLUE+"Hello from another thread.");
	
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println(ThreadColor.ANSI_BLUE+"another thread woke me up");
		}
	
		System.out.println(ThreadColor.ANSI_BLUE+"Three seconds has passed");
	}
}
