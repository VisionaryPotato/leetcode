package src.SlidingWindow.Fixed;

public class MaxSumSubarray {
    public static int sum(int[] arr, int i, int j) {
        int sum = 0;
        for (; i < j; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int alternativeSolution(int[] array, int k){
        int max = Integer.MIN_VALUE;
        int currentRunningSum = 0;
        //NEED AND EXTRA CONDITIONAL CHECK
        if(k == 0){return currentRunningSum;}
        for (int i = 0; i < array.length; i++){
            currentRunningSum += array[i];
            if(i >= k-1){
                max = Math.max(max, currentRunningSum);
                currentRunningSum -= array[i - (k-1)];
            }
        }
        return max;
    }

    public static int maxSum(int[] array, int k){
        //Given an array of size n, find the maximum sum of a contiguous subarray of size k.
        int max = sum(array,0, k);
        for (int i = 1; k < array.length; i++){
            int currMax = sum(array, i, ++k);
            if(currMax > max)
                max = currMax;
        }
        return max;
    }
}
