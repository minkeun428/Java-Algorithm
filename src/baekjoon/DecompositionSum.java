package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecompositionSum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int newInt = 0;

        for(int i = 0; i < N; i++) {
            int num = i;
            int sum = 0;   // 각 자릿수 합

            while(num != 0) {  //몫이 0이 될 때까지 나눈다.
                sum += num % 10;  //각 자릿수 더하기
                num /= 10;
            }

            //(1+2+3) + 123 == N
            if(sum + i == N) {
                newInt = i;
                break;
            }
        }

        System.out.println(newInt);
    }
}
