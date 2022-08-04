package src.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum{
	public static int[] bruteForce(int[] nums, int target){
		/*
		Given an array of numbers and a target value,
		return the indecies of the two numbers that add up to the target value.
		parameters: array, int
		return: array
		*/

		// iterate over the entire array.
		// 1 index @ 1st element (i), 2nd index @ 2nd element (j)
		// 		if i + j = target, return i & j;
		// keep incrementing our 2nd element & if no target sum is found, we increment the 1st element.

		for(int i = 0; i < nums.length; i++){
			// keep in mind that this is going to have an O(N^2) time complexity
			// One loop iterating over nums is O(N)
			for (int j = 1; j < nums.length; j++){
				// Another loop leads to O(N) * O(N) time complexity which is eq. to O(N^2)
				if(nums[i] + nums[j] == target)
					return new int[]{i, j};
			}
		}
		return null;
	}

	public static int [] optimal(int [] nums, int target) {
		// Another way to look at this problem is through a mathematical pov.
		// say we have a value x and are trying to get a value z aka, x + y = z.
		// we could formulate an equation to find the value of y so the condition is valid.
		// y = z-x

		// We could scan an all the values of the array where we try to find the value of y where
		// when added to our index (x) results in our target value.

		Map<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int y = target - nums[i];
			//x is our constant throughout the iteration
			//we could get the value of y though our target(z) - constant(x)
			//CONSTRAINT: Can't count the same number twice.
			if (hashMap.containsKey(y)) {
				return new int[]{i, hashMap.get(y)};
			}
			else{
				hashMap.put(nums[i], i);
			}

		}
		return null;
	}

	public static int[] recursive(int [] nums, int target, int index){
		//Base: index == nums.length(), return [] - no answer exists.
		if(index == nums.length){
			System.out.print("Base Case");
			return new int[0];
		}
		//Iterate over our nums array using our index as our constant and index+1 as our pointer
		for(int i = index+1; i< nums.length; i++){
			int sum = nums[index] + nums[i];
			if(sum == target){return new int[]{i, index};}
		}
		return recursive(nums, target, index+1);
	}

	public static void test(int[] nums, int[] results, int target){
		System.out.println("TESTING: " + Arrays.toString(results));
		assert (nums[results[0]] + nums[results[1]] == target);
	}

	public static void runExperiment(int[] nums, int target, int[] results){
		test(nums, results, target);
	}

	public static void run(int[] nums, int target){
		//int [] results = bruteForce(nums, target); // first method
		String [] types = new String[]{"brute","recursive", "optimal"};
		System.out.println("********** Starting **********");
		for (String type : types){
			int [] results = null;
			long startTime = System.nanoTime();
			switch (type){
				case "brute":
					results = bruteForce(nums, target);
					break;
				case "optimal":
					results = optimal(nums, target);
					break;
				case "recursive":
					results = recursive(nums, target, 0);
					break;
			}
			runExperiment(nums, target, results);
		}
		System.out.println("********** Done **********");
	}

	public static void main(String args[]){
		HashMap<int[], Integer> testCases = new HashMap<>();
		testCases.put(new int[]{1,2,3}, 5);
		testCases.put(new int[]{2,7,11,15}, 9);
		testCases.put(new int[]{3,2,4}, 6);
		testCases.put(new int[]{3,3}, 6);
		testCases.forEach(TwoSum::run);
	}
}
