package Threads;

public class Main {

	public static void main(String[] args) {		
		System.out.println(ThreadColor.ANSI_BLACK+"Hello from the main thread");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.start();

		System.out.println(ThreadColor.ANSI_BLACK+"Hello again from the main thread");
		anotherThread.interrupt();
	}
}
