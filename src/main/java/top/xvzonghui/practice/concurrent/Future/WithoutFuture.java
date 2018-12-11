package top.xvzonghui.practice.concurrent.Future;

/**
 * Created by zonghuixu on 9/26/18.
 */
public class WithoutFuture {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Bread bread = new Bread();
		Milk milk = new Milk();
		bread.start();
		milk.start();
		try {
			bread.join();
			milk.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("total time cost："+(end-start));
	}
}
