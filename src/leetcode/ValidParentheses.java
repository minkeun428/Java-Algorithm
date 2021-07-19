package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] arr = s.toCharArray();

        for(char c : arr) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.size() == 0 || stack.pop() != '(') {
                    return false;
                }
            }
            else if(c == '}') {
                if(stack.size() == 0 || stack.pop() != '{') {
                    return false;
                }
            }
            else if(c == ']') {
                if(stack.size() == 0 || stack.pop() != '[') {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
