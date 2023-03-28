package cogent_batch65;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreams {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {			
			fis = new FileInputStream("C://Users//nicki//streams//abc.txt");
			fos = new FileOutputStream("C://Users//nicki//streams//xyz.txt");
			int data;
			
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally { 
			try {
				fis.close();
				fos.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
		
	}
	
}
