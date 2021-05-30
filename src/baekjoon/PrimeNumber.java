package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

    public static boolean prime[];

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        prime = new boolean[N + 1];  //배열 생성
        get_prime();

        //소수 합 및 최솟값 초기
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = M; i <= N; i++) {
            if(prime[i] == false) {  //false = 소수
                sum += i;
                if(min == Integer.MAX_VALUE) {  //어차피 첫 소수가 최솟값임
                    min = i;
                }
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    // 에라토스테네스 체 알고리즘화 = prime배열 셋팅
    public static void get_prime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i] == true) continue;  //이미 체크된 배열이면 skip

            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
}
