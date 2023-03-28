package cogent_batch65;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayBingo {

		public static void main(String[] args) {
			
			if (args.length>0) {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
			
				int[] newarr = new int[5];
				
				for (int i=0;i<newarr.length;i++) {
					int randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
					newarr[i]=randomNum;
					System.out.println(newarr[i]);
				}
			
				int flag1 = 0;
				int flag2 = 0;
				for (int i=0;i<newarr.length;i++) {
					if (newarr[i]==num1) {
						flag1 = 1;
					}
					if (newarr[i]==num2) {
						flag2 = 1;
					}
				}
				if (flag1==1 && flag2==1) {
					System.out.println("Bingo");
				}
				else {
					System.out.println("No Bingo");
				}
			}
		}
}
