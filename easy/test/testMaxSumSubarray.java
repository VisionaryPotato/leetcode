package test;

import src.SlidingWindow.Fixed.MaxSumSubarray;

public class testMaxSumSubarray {

    public static void main(String args[]){
        System.out.println(MaxSumSubarray.maxSum(new int[]{7,8,1,2,4,12},2));
        System.out.println(MaxSumSubarray.alternativeSolution(new int[]{7,8,1,2,4,12},2));
    }
}
