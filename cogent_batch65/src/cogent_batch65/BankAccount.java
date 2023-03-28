package cogent_batch65;

public class BankAccount {
	
	int accNo;
	String custName;
	String accType;
	float balance;
	
	public BankAccount(int accno, String custname, String acctype, float initbal) throws LowBalanceException, NegativeAmountException {
		this.accNo = accno;
		this.custName = custname;
		this.accType = acctype;
		this.balance = initbal;
		
		if(this.balance<0) {
			throw new NegativeAmountException("The balance cannot be negative.");
		}
		else if(this.accType.endsWith("Savings")) {
			if(this.balance<1000) {
				throw new LowBalanceException("The balance is too low to perform the operation.");
			}
		}
 		else if(this.accType.endsWith("Checking")) {
 			if(this.balance<5000) {
				throw new LowBalanceException("The balance is too low to perform the operation.");
			}
		}
	}
	
	void deposit(float amt) {
		this.balance += amt;
	}
	
	void withdraw(float amt) throws LowBalanceException, NegativeAmountException {
		if(amt<0) {
			throw new NegativeAmountException("The withdrawal amount cannot be negative.");
		}
		else if(this.accType.endsWith("Savings")) {
			if(this.balance-amt<1000) {
				throw new LowBalanceException("The balance is too low to perform the operation.");
			}
			else{ 
	 			this.balance -= amt;
	 		}
		}
 		else if(this.accType.endsWith("Checking")) {
 			if(this.balance-amt<5000) {
				throw new LowBalanceException("The balance is too low to perform the operation.");
			}
 			else{ 
 	 			this.balance -= amt;
 	 		}
		}
 
	}
	
	float getBalance() throws LowBalanceException {
		if(this.accType.endsWith("Savings")) {
			if(this.balance<1000) {
				throw new LowBalanceException("The balance is too low to perform the operation.");
			}
		}
 		else if(this.accType.endsWith("Checking")) {
 			if(this.balance<5000) {
				throw new LowBalanceException("The balance is too low to perform the operation.");
			}
		}
		return this.balance;
	}

}
