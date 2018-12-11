package top.xvzonghui.practice.concurrent;

/**
 * Created by zonghuixu on 9/26/18.
 */
public class ThreadSync {
	public static void main(String[] args) {
		Thread myThread = new MyThread();
		myThread.start();
		System.out.println("main thread");
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("myThread is running...");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("myThread done!");
	}
}
