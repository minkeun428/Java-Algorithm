package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if(str.equals(".")) {
                break;
            }else {
                sb.append(solve(str)).append('\n');
            }
        }

        System.out.print(sb);
    }

    static String solve(String str) {
        Stack<Character> stack = new Stack();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);   //문자 하나씩 추출

            if (c == '(' || c == '[') {   //( 와 [는 푸쉬
                stack.push(c);
            }
            else if(c == ')') {  //닫을려고 할 때, peek()으로 해당 괄호 있는지 확인 후 닫기
                if(stack.empty() || stack.peek() != '(') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
            else if(c == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }

        }  //End of for

        if(stack.empty()) {
            return "yes";
        }
        else {
            return "no";
        }

    }
}
