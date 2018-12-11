package top.xvzonghui.practice.concurrent.Future;

/**
 * Created by zonghuixu on 9/26/18.
 */
public class Milk extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("milk is done!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
