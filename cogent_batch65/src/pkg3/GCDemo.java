package pkg3;

public class GCDemo {
	
	int objId;
	
	GCDemo(int objId) {
		this.objId = objId;
		
		System.out.println("Created: "+this.objId);
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<1000;i++) {
			new GCDemo(i);
			System.gc();
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized"+this.objId);
	}

}
