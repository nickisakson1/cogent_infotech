package cogent_batch65;

import java.util.Scanner;

public class BankAccountMain {
	
	public static void main(String[] args) throws LowBalanceException, NegativeAmountException {
		
		Scanner sc = new Scanner(System.in);
		
		float amt = 0.0f;
		BankAccount ba = null;
		int choice;
		
		System.out.println("What is your bank account number?");
		int accnum = sc.nextInt();
		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("What is your account type?");
		String acctype = sc.next();
		System.out.println("What is your initial balance?");
		float initbal = sc.nextFloat();
		
		try {
			ba = new BankAccount(accnum, name, acctype, initbal);
			do {
				System.out.println("*************Menu*************");
				System.out.println("1-Deposit");
				System.out.println("2-Withdraw");
				System.out.println("3-Get Balance");
				System.out.println("4-Exit");
				System.out.println("Please Enter Your Choice: ");
				
				choice = sc.nextInt();	
				
				switch(choice) {
					
				case 1:
					System.out.println("How much do you want to deposit?");
					amt = sc.nextFloat();
					ba.deposit(amt);
					break;
					
				case 2:
					System.out.println("How much do you want to withdraw?");
					amt = sc.nextFloat();
					try {
						ba.withdraw(amt);
					} catch(LowBalanceException l) {
						System.out.println(l.getMessage());
					} catch(NegativeAmountException e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 3:
					try {
						amt = ba.getBalance();
					} catch(LowBalanceException l) {
						System.out.println(l.getMessage());
					}
					System.out.println("Your balance is: "+amt);
					break;
				
				case 4:
					System.exit(0);
				}
			}while(choice!=4);
		} catch(LowBalanceException l) {
			System.out.println(l.getMessage());
		} catch(NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
