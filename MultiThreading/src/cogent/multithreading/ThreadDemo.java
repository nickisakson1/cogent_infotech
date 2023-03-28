package cogent.multithreading;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		// Part 1
		System.out.println("Part 1");
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt1.start();
		mt2.run();
		
		try{
			mt1.join();
			mt2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// Part 2
		System.out.println("Part 2");
		MyThread mt3 = new MyThread();
		MyThreadPt2 mt4 = new MyThreadPt2();
		
		mt3.start();
		mt4.run();
		
		try{
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// Part 3
		System.out.println("Part 2");
		MyThread mt5 = new MyThread();
		MyThreadPt2 mt6 = new MyThreadPt2();
		Thread t = new Thread(mt6);
		
		mt5.setPriority(Thread.MIN_PRIORITY);
		t.setPriority(Thread.MAX_PRIORITY);
		
		mt5.start();
		mt6.run();
		
	}

}
