package questions;

import java.util.*;

public class StringSplit {
	
	public static int solution(String s) {
		int count = 0;
		Map<Character, Integer> counts = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(counts.containsKey(s.charAt(i))) {
				counts.replace(s.charAt(i), counts.get(s.charAt(i))+1);
			}
			else {
				counts.put(s.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> entry:counts.entrySet()) {
			if(entry.getValue()>count) {
				count = entry.getValue();
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		int results = solution("cycle");
		System.out.println(results);
		
		results = solution("dddd");
		System.out.println(results);

		results = solution("world");
		System.out.println(results);
		
	}

}
