import java.util.HashMap;
import java.util.Map.Entry;


public class TwoSum{
	public static int[] bruteForce(int[] nums, int target){
		System.out.println(target);
		/*
		Given an array of numbers and a target value,
		return the indecies of the two numbers that add up to the target value.
		parameters: array, int
		return: array
		*/

		return nums;
	}
	public static boolean test(HashMap<int[], Integer> testCases){

		testCases.forEach(TwoSum::bruteForce);
		return true;
	}
	public static void main(String args[]){		
		HashMap<int[], Integer> testCases = new HashMap<>();
		
		testCases.put(new int[]{1,2,3}, 2);
		testCases.put(new int[]{1,5,2,3}, 6);
		testCases.put(new int[]{11,7,2,3}, 13);
		testCases.put(new int[]{11,7,2,3}, 13);

		test(testCases);
	}
}
