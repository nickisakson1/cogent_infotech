package questions;
import java.util.*;

public class Autocorrect {
	
	public static List<String> getSearchResults(String[] words, String[] queries) {
		List<String> res = new ArrayList<String>();
		int flag = 0;
		for(String q:queries) {
			flag = 0;
			for(String w:words) {
				if (w.length() != q.length()) {
			        flag = 0;
			    }
				else {
					char[] a1 = w.toCharArray();
				    char[] a2 = q.toCharArray();
				    Arrays.sort(a1);
				    Arrays.sort(a2);
				    if(Arrays.equals(a1, a2)) {
				    	res.add(w);
				    }
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		String[] arr1 = {"duel", "speed", "dule", "cars"};
		String[] arr2 = {"spede", "deul"};
		List<String> results = getSearchResults(arr1, arr2);
		
		System.out.println(results.toString());
		
	}
}
