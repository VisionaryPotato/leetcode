package src;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static char [] sort(String string){
        char [] stringArray = string.toCharArray();
        Arrays.sort(stringArray);
        return stringArray;
    }
    public static boolean isAnagram(String s, String t) {
        //My idea is to insert a character into the hashmap and have a counter along with it if it already exits.
        HashMap<String, String> st = new HashMap<>();
        if (s.length() != t.length()){return false;}
        char [] s1 = sort(s);
        char [] s2 = sort(t);
        return Arrays.equals(s1, s2);
    }

}