import java.util.HashSet;
import java.util.*;

public class LongestSubstring{

	public static void main(String args[]){
		System.out.println(lengthOfLongestSubstring("aabc"));
	

	}

	public static int lengthOfLongestSubstring(String s){


		HashSet<Character> seen = new HashSet<Character>();
		int start = 0;
		int end = 0;
		int result = 0;
		while(end < s.length()){

			if(!seen.contains(s.charAt(end))){
				seen.add(s.charAt(end));
				end++;
				result = Math.max(seen.size(),result);
			}
			else {
				seen.remove(s.charAt(start));
				start++;

			}
		}
	return result;
	}
	



}
