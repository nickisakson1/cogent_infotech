package serialization;

import java.io.*;

public class SerializationDemo {
	
	public static void main(String[] args) {
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("C://users//nicki//streams//Emp.ser");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1, "John", 10000, 12345);
			
			oos.writeObject(emp);
			System.out.println("Object Serialized.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
