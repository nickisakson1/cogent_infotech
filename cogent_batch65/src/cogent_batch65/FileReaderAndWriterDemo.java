package cogent_batch65;

import java.io.*;

public class FileReaderAndWriterDemo {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C://Users//nicki//streams//abc.txt");
			fw = new FileWriter("C://Users//nicki//streams//msg.txt");
			
			int ch;
			
			while((ch=(int)fr.read())!=-1) {
				fw.write(ch);
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				fr.close();
				fw.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
		
	}

}
