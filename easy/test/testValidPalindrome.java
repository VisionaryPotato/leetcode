package test;

import src.pointers.ValidPalindrome;

public class testValidPalindrome {
    public static void main(String args[]){
        System.out.println(ValidPalindrome.isPalindrome("Hello"));
        System.out.println(ValidPalindrome.isPalindrome("racecar"));
        System.out.println(ValidPalindrome.isPalindrome("redder"));
        System.out.println(ValidPalindrome.isPalindrome("lool"));
        System.out.println(ValidPalindrome.isPalindrome(" "));
        System.out.println(ValidPalindrome.isPalindrome("dave"));
        System.out.println(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
