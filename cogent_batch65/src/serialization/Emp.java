package serialization;

import java.io.Serializable;

public class Emp implements Serializable{

	int rollnum;
	String name;
	int age;
	String address;
	
	public Emp(int rollnum, String name, int age, String address) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
}
