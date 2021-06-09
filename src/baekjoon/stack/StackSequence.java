package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        // 스택 수열 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int start = 0;
        Stack<Integer> stack = new Stack();

        while(N-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if(value > start) {
                // start + 1부터 입력 받은 value까지 push.
                for(int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+").append('\n');
                }
                start = value; // 다음 push할 때 오름차순을 유지하기 위한 변수 초기화.
            }
            // top에 있는 원소가 입력 받은 값과 다르면
            else if(stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append('\n');
        }

        System.out.println(sb);
    }

}
