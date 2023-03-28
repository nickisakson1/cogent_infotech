package cogent.multithreading;

public class MultiThreaded extends Thread {

	public static void main(String[] args) {
		
		MultiThreaded mt = new MultiThreaded();
		
		mt.setPriority(MIN_PRIORITY);
		mt.setName("Shiva");
		mt.start();
		
		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MAX_PRIORITY);
		mt1.setName("John");
		mt1.start();
		
	}
	
	public void run() {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}
}
