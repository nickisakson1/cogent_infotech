package cogent.multithreading;

public class MyThread extends Thread{
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i: "+i);
			try {
				Thread.sleep(150);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
