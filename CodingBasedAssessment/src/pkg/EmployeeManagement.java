package pkg;

import java.util.Scanner;

import java.util.*;

public class EmployeeManagement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> eArray = new ArrayList<>();
		EmployeeDAOImpl dao = new EmployeeDAOImpl();
		int choice = 0;
	
		do {
			System.out.println("*************Menu*************");
			System.out.println("1-Create Employee");
			System.out.println("2-Update Employee");
			System.out.println("3-Delete Employee");
			System.out.println("4-Read All");
			System.out.println("5-Search Employee");
			System.out.println("6-Sort All Based on Name");
			System.out.println("7-Exit");
			System.out.println("Please Enter Your Choice: ");
		
			choice = sc.nextInt();	
		
			switch(choice) {
		
			case 1:
				System.out.println("How man employees would you like to add?");
				choice = sc.nextInt();
				dao.create(eArray, choice);
				break;
			
			case 2:
				if(eArray!= null) {
					System.out.println("Which employeeNo would you like to update?");
					int no = sc.nextInt();
					dao.update(eArray, no);
				}
				else {
					System.out.println("Please create the record first");
				}
				break;
				
			case 3:
				if(eArray!= null) {
					System.out.println("Which employeeNo do you want to delete?");
					int del = sc.nextInt();
					dao.delete(eArray, del);
				}
				else {
					System.out.println("Please create the record first");
				}
				break;
				
			case 4:
				if(eArray!=null) {
					dao.read(eArray);
				}
				else {
					System.out.println("Please create the record first");
				}
				break;
				
			case 5:
				if(eArray!= null) {
					System.out.println("Which employeeNo do you want to search?");
					int search = sc.nextInt();
					dao.search(eArray, search);
				}
				else {
					System.out.println("Please create the record first");
				}
				break;
				
			case 6:
				if(eArray!=null) {
					dao.sort(eArray);
				}
				else {
					System.out.println("Please create the record first");
				}
				break;

		
			case 7:
				System.exit(0);
			}
		}while(choice!=7);
	}

}
