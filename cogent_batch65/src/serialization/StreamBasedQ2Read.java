package serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StreamBasedQ2Read {
	
	public static void main(String[] args) {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("C://users//nicki//streams//Emps7.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			int flag = 0;
			
			while(flag==0) {
				try {
					Object obj = (Emp)ois.readObject();
					Emp emp = (Emp)obj;
					System.out.println("Roll Num is: "+emp.rollnum);
					System.out.println("Name is: "+emp.name);
					System.out.println("Age is: "+emp.age);
					System.out.println("Address is: "+emp.address);
				}catch(EOFException e) {
					flag = 1;
					System.out.println("End");
				}
			}
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
