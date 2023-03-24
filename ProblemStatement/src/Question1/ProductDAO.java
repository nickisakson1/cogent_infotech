package Question1;

import java.util.Scanner;

public class ProductDAO {
	
	Scanner sc = new Scanner(System.in);
	
	public void create(Product[] prod, int i) {
		
		Product b = new Product();
		prod[i] = b;
		System.out.println("Please enter the product ID");
		prod[i].setProductID(sc.nextInt());
		System.out.println("Please enter the product name");
		prod[i].setProductName(sc.next());
		System.out.println("Please enter the product price");
		prod[i].setProductPrice(sc.next());
		
	}
	
	public void read(Product[] product) {
		
		for(int i=0;i<product.length;i++) {
			if(product[i]!=null) {
				System.out.println("Product ID is: "+product[i].getProductID());
				System.out.println("Product Name is: "+product[i].getProductName());
				System.out.println("Product Price is: "+product[i].getProductPrice());
			}
		}
	}

	public void update(Product[] product, int id, int newid, String newname, String newprice) {
		
		int flag = 0;
		for(int i=0;i<product.length;i++) {
			if(product[i].getProductID()==id) {
				product[i].setProductID(newid);
				product[i].setProductName(newname);
				product[i].setProductPrice(newprice);
				flag = 1;
			}
		}
		
		if(flag==0) {
			System.out.println("The product ID could not be found");
		}
	
	}

	public void delete(Product[] product, int del) {
		
		for(int i=0;i<product.length;i++) {
			if(product[i].getProductID()==del) {
				product[i] = null;
			}
		}
	}

}
