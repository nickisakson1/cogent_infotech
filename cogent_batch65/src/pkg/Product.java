package pkg;

public class Product {
	
	int pId;
	String pName;
	float pPrice;
	
	public Product() {
		
		this.pId = 1001;
		this.pName = "T-Shirt";
		this.pPrice = 5.25f;
	}
	
	public Product(int p, String s, float pr) {
		
		this.pId = p;
		this.pName = s;
		this.pPrice = pr;
	}
	
	protected void showProductInfo() {
		System.out.println(this.pId);
		System.out.println(this.pName);
		System.out.println(this.pPrice);
	}

}
