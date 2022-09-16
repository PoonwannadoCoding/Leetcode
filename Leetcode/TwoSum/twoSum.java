import java.util.HashMap;
import java.util.Arrays;

public class twoSum{

	public static void main(String args[]){
		int setOfNum[] = {7, 2, 4, 6, 10};
		int target = 11;
		String meep = Arrays.toString(twoSums(setOfNum, target));
		System.out.println(meep);
		
	}


	public static int[] twoSums(int [] nums, int target){

		HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++){
			int needNum = target - nums[i];

			if (seen.containsKey(needNum)){
				int result[] = {seen.get(needNum), i};
				return result;
			}

			seen.put(nums[i], i);

		}
		return null;

	}


}
