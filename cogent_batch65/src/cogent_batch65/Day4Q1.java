package cogent_batch65;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day4Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String src = args[0];
		String dest = args[1];
		String choice;
		int flag = 0;
		
		FileReader fr = null;
		FileReader fr2 = null;
		FileWriter fw = null;
		
		try {
			fr2 = new FileReader(dest);
			System.out.println("Would you like to overwrite the file?");
			choice = sc.next();
			if(choice=="Yes") {
				flag = 1;
			}
		}catch(FileNotFoundException e) {
			flag = 1;
		}finally {
			try {
				fr2.close();
			}
			catch(Exception e) {
				
			}
		}
		
		try {
			fr = new FileReader(src);
			fw = new FileWriter(dest);
			
			int ch;
			
			while((ch=(int)fr.read())!=-1 && flag==1) {
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
