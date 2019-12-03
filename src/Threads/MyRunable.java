package Threads;

public class MyRunable implements Runnable{

	@Override
	public void run() {
		System.out.println(ThreadColor.ANSI_GREEN+"Hello from myRunable's class");
		
	}
	
}
