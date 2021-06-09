package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {
    public static int ptr = 0;  // 현재 쌓여있는 수
    public static int stk[];


    public static void push(int x) {
        stk[ptr] = x;
        ptr++;
    }

    public static int pop() {
        if(ptr == 0) {
            return -1;
        }else {
            int rtn = stk[--ptr];  //맨 위에 수 빼기
            stk[--ptr] = 0;   //맨 위에 인덱스는 0으로
            ptr--;

            return rtn;
        }
    }

    public static int size() {
        return ptr;
    }

    public static int empty() {
        if(ptr < 1) return 1;
        else return 0;
    }

    public static int top() {
        if(ptr < 1) return -1;
        else return stk[ptr - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        stk = new int[N];

        while(N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);

    }

}
