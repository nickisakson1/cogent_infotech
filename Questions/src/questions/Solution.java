package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	public static int solution(double[] pollution) {
		int count = 0;
		double sum = 0;
		double current;
		double max;
		for(double i:pollution) {
			sum+=i;
		}
		current = sum;
		while(current > sum/2) {
			max = 0;
			for(double i:pollution) {
				if(i>max) {
					max = i;
				}
			}
			int flag = 0;
			for(int j=0;j<pollution.length;j++) {
				if(flag==0) {
					if(pollution[j]==max) {
						pollution[j]=pollution[j]/2;
						flag = 1;
					}
				}
			}
			current=current-max/2;
			count+=1;
		}
		return count;
	}

	public static void main(String[] args) {
		
		double[] arr1 = {5, 19, 8, 1};
		int results = solution(arr1);
		
		System.out.println(results);
		
		double[] arr2 = {10,10};
		results = solution(arr2);
		System.out.println(results);
		
		double[] arr3 = {3, 0, 5};
		results = solution(arr3);
		System.out.println(results);
		
	}

}
