package cogent_batch65;

import java.util.Scanner;

public class EmpMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What do you want the emp Id to be?");
		int empid = sc.nextInt();
		System.out.println("What do you want the emp name to be?");
		String empname = sc.next();
		System.out.println("What do you want the designation to be?");
		String des = sc.next();
		System.out.println("What do you want the basic to be?");
		int bas = sc.nextInt();
		System.out.println("What do you want the price to be?");
		double price = sc.nextDouble();
		
		try {
			Emp e = new Emp(empid, empname, des, bas, price);
			e.calculateHRA();
			e.printDET();
		}catch(LowSalException l) {
			System.out.println(l.getMessage());
		}
	}

}
