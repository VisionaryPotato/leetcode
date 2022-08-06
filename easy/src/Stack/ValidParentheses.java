package src.Stack;

//import java.util.Stack;
import algos.src.Stack;
public class ValidParentheses {


    public static boolean optimal(String s){
        System.out.println(s);
        //EDGE CASE: a pair consists of 2 or more values.
        if(s.length() < 2){return false;}
        // This solution uses a stack data structure where the last thing inserted into is the first
        // item.
        Stack<Character> stack = new Stack<>();
        // Our stack will add the characters from our String if they are the opener paren.
        // This will help us ensure that the parens. are being closed in the correct order.
        // This will help us validate whether a successful pair is present in string
        for (int i = 0; i < s.length(); i++){
            // EDGE CASE: fist character in the string must be an opener to be considered valid.
            if ((i == 0) && s.charAt(i) != '('  && s.charAt(i) != '{' && s.charAt(i) != '['){return false;}
            //'(', ')', '{', '}', '[' and ']'
            // we could store the opening paren. in our stack when encountered.
            else if(s.charAt(i) == '('  || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            //if it's not an opening paren. we check if the latest item in our stack (opener) matches our closer.
            else if(!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')' ||
                    !stack.isEmpty() && stack.peek() == '{' && s.charAt(i) == '}' ||
                    !stack.isEmpty() && stack.peek() == '[' && s.charAt(i) == ']') {stack.pop();}
            else{
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }

    public static void main(String args[]){
        boolean test1 = optimal("[]"); // valid
        boolean test2 = optimal("([])"); // valid encapsulated pair
        boolean test3 = optimal("[[]");
        boolean test4 = optimal("[");
        boolean test5 = optimal(")(){}");
        boolean test6 = optimal("(])");
        assert test1;
        assert test2;
        assert !test3;
        assert !test4;
        assert !test5;
        assert !test6;
    }
}