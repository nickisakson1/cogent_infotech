package cogent_batch65;

public class Ointment extends Medicine{
	
	String taste;
	
	public Ointment(String name, String address, String taste) {
		super(name, address);
		this.taste = taste;
	}
	
	public void displayLabel() {
		System.out.println("Ointment Name: "+this.name);
		System.out.println("Ointment Address: "+this.address);
		System.out.println("Ointment Taste: "+this.taste);
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

}
