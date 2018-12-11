package top.xvzonghui.practice.concurrent.Future;

/**
 * Created by zonghuixu on 9/26/18.
 */
public class Bread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("bread is done!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
