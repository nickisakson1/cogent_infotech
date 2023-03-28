package inheritance;

public class Publication {
	private String title;
	private double price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price>0) {
			this.price = price;
		}
		else {
			System.out.println("Invalid Price");
		}
	}
	
	public void sell(int qty) {
		System.out.println("Total: $"+price*qty);
	}
}
