package cogent_batch65;

public class Medicine {

	String name;
	String address;
	
	public Medicine(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void displayLabel() {
		System.out.println(this.name);
		System.out.println(this.address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
