package test;

import algos.src.Stack;

public class testStack {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println();
        stack.show();

        stack.clear();

        System.out.println();
        stack.show();
        stack.push(1);
        stack.push(21);
        stack.push(41);
        stack.show();
        stack.clear();
        stack.show();
    }
}
