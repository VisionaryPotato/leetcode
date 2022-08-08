package test;

import src.Arrays.binarySearch;
public class testBinarySearch {
    public static void main(String args[]){
        System.out.println(binarySearch.search(new int []{-1,0,3,5,9,12}, -1));
        System.out.println(binarySearch.search(new int []{-1,0,3,5,9,12}, 2));
        System.out.println(binarySearch.search(new int []{-1,0,3,5,9,12}, 5));
        System.out.println(binarySearch.search(new int []{-1,0,3,5,9,12}, 9));
        System.out.println(binarySearch.search(new int []{1,4}, 0));
        System.out.println(binarySearch.search(new int []{5}, -5));
    }
}
