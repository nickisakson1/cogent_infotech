package cogent_batch65;

public class Tablet extends Medicine{
	
	String weight;

	public Tablet(String name, String address, String weight) {
		super(name, address);
		this.weight = weight;
	}
	
	public void displayLabel() {
		System.out.println("Tablet Name: "+this.name);
		System.out.println("Tablet Address: "+this.address);
		System.out.println("Tablet Weight: "+this.weight);
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
}
