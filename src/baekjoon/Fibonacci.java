package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = fibonacci(n);

        System.out.println(result);
    }

    static int fibonacci(int n) {
        //재귀 탈출 조건
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
