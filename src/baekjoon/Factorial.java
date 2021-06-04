package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        /**
         * 10! 구하는 반복문
         *
            int result = 1;
            for(int j =0; j < 10; j++) {
                result = result * (10 - j);
            }
             System.out.println(result);
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = make_recursion(N);

        System.out.println(sum);
    }

    static int make_recursion(int N) {
        if(N <= 1) return 1;    //재귀 종료조건

        //함수 복사본이 계속 생기면서..
        //N<=1 조건이 충족하는 순간
        //return 1; 부터 시작해서
        //각 함수 복사본의 return값들이 첫 재귀함수 까지 오게 됨.
        // return 1 -> return 2 * (1) -> return 3 * (2 * 1) -> ...
        return N * make_recursion(N - 1);
    }

}
