package serialization;

import java.io.*;
import java.util.Scanner;

public class StreamBasedQ2 {
	
	int rn;
	String name;
	int age;
	String address;
	Scanner sc = new Scanner(System.in);
	String choice;
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	
	public static void main(String[] args) {

		StreamBasedQ2 run = new StreamBasedQ2();
		int flag = 0;
		try {
			fos = new FileOutputStream("C://users//nicki//streams//Emps7.ser");
			oos = new ObjectOutputStream(fos);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		while(flag==0) {
			try {
				flag = run.getInput();
				try {
					if(flag==0) {
						run.saveFile();
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
			}catch(BlankEntry b) {
				System.out.println("Please enter non-blank data.");
			}catch(Exception e) {
				System.out.println("Please enter proper data.");
			}
		}
		try {
			fos.close();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int getInput() throws BlankEntry{
		System.out.println("Would you like to add data?");
		this.choice = sc.next();
		
		if(this.choice.equals("Yes")) {
			System.out.println("Enter a Roll Number: ");
			this.rn = sc.nextInt();
			System.out.println("Enter a Name: ");
			this.name = sc.next();
			System.out.println("Enter an Age: ");
			this.age = sc.nextInt();
			System.out.println("Enter an Address: ");
			this.address = sc.next();
			
			if(this.rn==0 || this.name==null || this.age==0 ||this.address==null) {
				throw new BlankEntry("Blank Entries");
			}
			
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public void saveFile() throws IOException {
		
		System.out.println("Would you like to write the data in a file?");
		choice = sc.next();
		
		if(choice.equals("Yes")) {
			
			Emp temp = new Emp(this.rn, this.name, this.age, this.address);
			
			oos.writeObject(temp);
		}
	}

}
