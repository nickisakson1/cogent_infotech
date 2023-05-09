package questions;
import java.util.*;

public class StayPositive {
	
	public static int solution(int[] arr) {
		int runningSum = 0;
		ArrayList<Integer> sums = new ArrayList<Integer>();
		int min;
		int solution;
		
		for(int i:arr) {
			runningSum+=i;
			sums.add(runningSum);
		}
		min = sums.get(0);
		for(Integer i:sums) {
			if(i<min) {
				min = i;
			}
		}
		solution = 1-min;
		if(solution<0) {
			solution = 1;
		}
		return solution;
	}

	public static void main(String[] args) {
		
		int[] arr1 = {-4, 3, 2, 1};
		int results = solution(arr1);
		
		System.out.println(results);
		
		int[] arr2 = {3, -6, 5, -2, 1};
		results = solution(arr2);
		
		System.out.println(results);
		
		int[] arr3 = {5};
		results = solution(arr3);
		
		System.out.println(results);
		
	}

}
