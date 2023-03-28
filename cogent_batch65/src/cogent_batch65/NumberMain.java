package cogent_batch65;

import java.util.Scanner;

public class NumberMain {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int choice;
		int x;
		int y;
		int z;
		CalcAverage ca = new CalcAverage();
		Number n = null;
		
		System.out.println("Please enter a natural number: ");
		z = sc.nextInt();
		try {
			System.out.println("The average of the first "+z+" natural numbers is: "+ca.avgFirstN(z));
		}catch(IllegalArgumentException l) {
			System.out.println("Invalid arguments entry.");
		}
		
		System.out.println("What do you want the first number to be?");
		x = sc.nextInt();
		System.out.println("What do you want the second number to be?");
		y = sc.nextInt();
		
		try {
			n = new Number(x,y);
		}catch(IllegalArgumentException l) {
			System.out.println("Invalid arguments entry.");
		}
	
		do {
			System.out.println("*************Menu*************");
			System.out.println("1-Add");
			System.out.println("2-Subtract");
			System.out.println("3-Multiply");
			System.out.println("4-Divide");
			System.out.println("5-Exit");
			System.out.println("Please Enter Your Choice: ");
			
			choice = sc.nextInt();	
			
			switch(choice) {
				
			case 1:
				n.add();
				break;
				
			case 2:
				n.sub();
				break;
				
			case 3:
				n.mul();
				break;
				
			case 4:
				n.div();
				break;
			
			case 5:
				System.exit(0);
			}
			System.out.println("The current result is: "+n.result);
		}while(choice!=4);
		
		}

}
