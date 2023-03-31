package pkg;

import java.util.ArrayList;

public interface EmployeeDAO {
	
	public void create(ArrayList<Employee> eArray,int num);
	public void update(ArrayList<Employee> eArray,int empNo);
	public void delete(ArrayList<Employee> eArray,int empNo);
	public void read(ArrayList<Employee> eArray);
	public void search(ArrayList<Employee> eArray,int empNo);
	public void sort(ArrayList<Employee> eArray);

}
