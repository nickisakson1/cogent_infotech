package cogent.multithreading;

class MyThread3 implements Runnable {
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i: "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {
	
	public MyThread2() {
		super("Demo Thread");
		System.out.println("The child thread: "+this);
		start();
	}
	
	public void run() {
		for(int k=5;k>0;k--) {
			System.out.println("Child k: "+k);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}	
}

public class Main {
	
	public static void main(String[] args) {
		
		MyThread3 st = new MyThread3();
		Thread th = new Thread(st);
		th.start();
		
		new MyThread2();
		
		for(int j=0;j<=10;j++) {
			System.out.println("j: "+j);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public void printNumbers() {
		
		for(int i=0;i<=200;i++) {
			System.out.println("i: "+i);
		}
	}
}
