package cogent_batch65;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraQ9 {

		public static void main(String[] args) {

			int[] newarr = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
				
			int sum = 0;
			int average = 0;
			int smallest = newarr[0];
			for (int i=0;i<15;i++) {
				sum += newarr[i];
				if (newarr[i]<smallest) {
					smallest = newarr[i];
				}
			}
			average = sum/15;
			newarr[15]=sum;
			newarr[16]=average;
			newarr[17]=smallest;
			for (int i=0;i<newarr.length;i++) {
				System.out.println(newarr[i]);
			}
		}
}
