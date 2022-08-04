package src.pointers;

public class ValidPalindrome {
    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
    and removing all non-alphanumeric characters, it reads the same forward and backward.
    Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
    */
    public static boolean naive(String input){
        /*
        We are provided an input string. Before anything, ASK: Should we assume that the input string is properly formatted?
        If we don't make that assumption, we should convert the string into all lowercase letters & remove any non-alphanumeric characters.
        */
        input = input.toLowerCase().replaceAll("[^a-z0-9]","");
        //One way to approach this problem is to split string into two substrings
        //1st string from index 0, index input.lenght//2.
        int midpoint = input.length()/2;
        String firstHalf = input.substring(0, midpoint);
        // if our string length is odd, increase midpoint as both strings would share the same char.
        // reverse our second half and compare strings.
        if(input.length() % 2 != 0) midpoint++;
        String invertedSecondHalf = reverse(input.substring(midpoint));
        return firstHalf.equals(invertedSecondHalf);
    }

    public static String reverse(String substring){
        StringBuilder reverse = new StringBuilder();
        for(int i = substring.length() - 1; i >= 0; i--)
            reverse.append(substring.charAt(i));
        return reverse.toString();
    }

    public static boolean isPalindrome(String s) {
        //build a new string meeting the alpha-numeric conditions.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        //Convert to lowercase & store it back in s.
        s = sb.toString().toLowerCase();
        int midpoint = s.length()/2;
        int start = 0;
        int end = s.length()-1;
        while(start<s.length()){
            //now we check if our char @ start equals to our char @ end, if not return false
            //if we reach our midpoint, exit loop
            if(start == midpoint) break;
            if(s.charAt(start) != s.charAt(end)) return false;
            end--;
            start++;
        }
        //return naive(s);
        return true;
    }
}
