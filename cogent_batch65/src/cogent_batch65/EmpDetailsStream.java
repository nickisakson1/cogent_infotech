package cogent_batch65;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EmpDetailsStream {

public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C://Users//nicki//streams//employee.txt");
			fos = new FileOutputStream("C://Users//nicki//streams//newemployee.txt");
			int i;
			int flag = 0;
			
			while((i=fis.read())!=-1) {
				if(i==32 && flag==0) {
					System.out.println("");
					System.out.print(" Emp Name: ");
					flag = 1;
				}
				else if(i==32 && flag==1) {
					System.out.println("");
					System.out.print(" Emp Salary: $");
					flag = 0;
				}
				System.out.print((char)i);
				fos.write((char)i);
			}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
		
	}
}
