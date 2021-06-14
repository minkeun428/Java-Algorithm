package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T > 0) {
            sb.append(solve(br.readLine())).append('\n');
            T--;
        }

        System.out.println(sb);
    }

    static String solve(String str) {
        Stack<Character> stack = new Stack();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(c);
            }
            else if(stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }

        if(stack.empty()) return "YES";
        else return "NO";

    }
}
