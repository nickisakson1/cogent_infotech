package cogent.multithreading;

public class MyThreadPt2 implements Runnable {

	public void run() {
		for(int j=0;j<=10;j++) {
			System.out.println("j: "+j);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
