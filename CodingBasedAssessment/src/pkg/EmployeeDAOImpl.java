package pkg;

import java.util.*;

public class EmployeeDAOImpl implements EmployeeDAO{

	public void create(ArrayList<Employee> eArray, int num) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<num;i++) {
			System.out.println("What is the employeeNo?");
			int empNo = sc.nextInt();
			System.out.println("What is the employee name?");
			String empName = sc.next();
			System.out.println("What is the employee address?");
			String empAdd = sc.next();
			System.out.println("What is the employee email?");
			String empEmail = sc.next();
			System.out.println("What is the employeeSal?");
			int empSal = sc.nextInt();
			eArray.add(new Employee(empNo, empName, empAdd, empEmail, empSal));
		}
	}
	
	public void update(ArrayList<Employee> eArray, int empNo) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the new employeeNo: ");
		int newno = sc.nextInt();
		System.out.println("Please enter the new employee name: ");
		String newname = sc.next();
		System.out.println("Please enter the new employee address: ");
		String newaddress = sc.next();
		System.out.println("Please enter the new employee email: ");
		String newemail = sc.next();
		System.out.println("Please enter the new employee salary: ");
		int newsal = sc.nextInt();
		
		for(Employee e:eArray) {
			if(e.getEmployeeNo()==empNo) {
				e.setEmployeeNo(newno);
				e.setEmployeeName(newname);
				e.setEmployeeAddress(newaddress);
				e.setEmployeeEmail(newemail);
				e.setEmployeeSalary(newsal);
			}
		}
	}
	
	public void delete(ArrayList<Employee> eArray, int empNo) {
		
		for(Employee e:eArray) {
			if(e.getEmployeeNo()==empNo) {
				eArray.remove(e);
			}
		}
	}
	
	public void read(ArrayList<Employee> eArray) {
		
		for(Employee e:eArray) {
			System.out.println("EmployeeNo: "+e.getEmployeeNo());
			System.out.println("Employee Name: "+e.getEmployeeName());
			System.out.println("Employee Address: "+e.getEmployeeAddress());
			System.out.println("Employee Email: "+e.getEmployeeEmail());
			System.out.println("Employee Salary: "+e.getEmployeeSalary());
			System.out.println();
		}
	}
	
	public void search(ArrayList<Employee> eArray, int empNo) {
		
		int flag = 0;
		for(Employee e:eArray) {
			if(e.getEmployeeNo()==empNo) {
				flag = 1;
			}
		}
		
		if(flag==1) {
			System.out.println("The employee is on the list.");
		} else {
			System.out.println("The employee is not on the list.");
		}
	}
	
	public void sort(ArrayList<Employee> eArray) {
		
		eArray.sort(new EmployeeNameComparator());
		read(eArray);
		
	}
}
