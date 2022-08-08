package src.Arrays;


public class binarySearch {
    public static int search(int[] nums, int target, int start, int end){
        //to reach an O(log n) search time complex, we can iteratively divide the length the nums array by n/2.
        //n/2 will give us the "middle" value of the nums aray to which were we could ask if the value @ nums[n/2] > < target
        //Case1. if array empty return false.
        //Case2. if nums[n/2] == target, return true.
        //Case3. if nums[n/2] > target, we choose the first half of the array.
        //Case4. if nums[n/2] < target, we choose the second half of the array.
        int mid= start+(end-start)/2;
        if(nums[mid]==target) return mid;
        if(start == end) {return -1;}
        else if(target<nums[mid])
            return search(nums, target, start,mid);

        else if(target>nums[mid])
            return search(nums, target, ++mid, end);

        return -1;
    }

    public static int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
}
