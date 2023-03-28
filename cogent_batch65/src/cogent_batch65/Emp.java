package cogent_batch65;

public class Emp {
	
	int empId;
	String empName;
	String designation;
	double basic;
	double hra;
	
	public Emp(int empid, String empname, String desi, double bas, double price) throws LowSalException{
		if(bas<500) {
			throw new LowSalException("The sal is too low.");
		}
		else {
			this.empId = empid;
			this.empName = empname;
			this.designation = desi;
			this.basic = bas;
		}
	}
	
	public void printDET() {
		System.out.println("The emp ID is: "+this.empId);
		System.out.println("The emp name is: "+this.empName);
		System.out.println("The designation is: "+this.designation);
		System.out.println("The basic is: "+this.basic);
		System.out.println("The hra is: "+this.hra);
	}
	
	public void calculateHRA() {
		if(designation.contentEquals("Manager")) {
			hra = basic*0.1;
		}
		else if(designation.contentEquals("Officer")) {
			hra = basic*0.12;
		}
		else if(designation.contentEquals("Clerk")) {
			hra = basic*0.05;
		}
		else {
			hra = 0;
		}
	}

}
