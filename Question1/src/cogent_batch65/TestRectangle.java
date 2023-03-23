package cogent_batch65;

import java.util.Scanner;

public class TestRectangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			System.out.println("What should be the length of Rectangle "+(i+1)+"?");
			int l = sc.nextInt();
			System.out.println("What should be the breadth of Rectangle "+(i+1)+"?");
			int b = sc.nextInt();
			
			Rectangle r = new Rectangle(l,b);
			r.calcArea();
			r.display();
		}
	}

}
