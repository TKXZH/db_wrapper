package top.xvzonghui.practice.concurrent;

/**
 * Created by zonghuixu on 9/13/18.
 */

public class WaitNotifyRannable implements Runnable {
	public WaitNotifyRannable(Object pre, String name, Object self) {
		this.pre = pre;
		this.name = name;
		this.self = self;
	}

	private Object pre;
	private String name;
	private Object self;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (pre) {
				synchronized (self) {
					System.out.println(name);
					self.notify();
				}

				try {
					if (i != 9) {
						pre.wait();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String args[]) throws Exception {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		WaitNotifyRannable A = new WaitNotifyRannable(c, "A", a);
		WaitNotifyRannable B = new WaitNotifyRannable(a, "B", b);
		WaitNotifyRannable C = new WaitNotifyRannable(b, "C", c);
		new Thread(A).start();
		Thread.sleep(1000);
		new Thread(B).start();
		Thread.sleep(1000);
		new Thread(C).start();
	}
}
