package pkg3;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		Integer y = Integer.valueOf(x);
		
		int z = y.intValue();
		
		System.out.println(z);
		
		byte b = 100;
		
		String s = Byte.toString(b);
		
		byte by = Byte.parseByte(s);
		
		System.out.println(by);
		
		long l = 1000;
		
		Long lo = Long.valueOf(l);
		
		String st = Long.toString(lo);
		
		Long lon = Long.valueOf(st);
		
		System.out.println(lon);
		
	}

}
