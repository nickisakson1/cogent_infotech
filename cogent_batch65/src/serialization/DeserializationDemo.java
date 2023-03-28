package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	
	public static void main(String[] args) {
	
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("C://users//nicki//streams//Emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = (Employee)ois.readObject();
	
			System.out.println("Employee id is: "+emp.id);
			System.out.println("Employee name is: "+emp.name);
			System.out.println("Employee salary is: "+emp.salary);
			System.out.println("Employee SSN is: "+emp.ssn);
			System.out.println("Object Serialized.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
