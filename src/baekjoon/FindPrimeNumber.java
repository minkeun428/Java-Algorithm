package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrimeNumber {
    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        //M이상 N이하의 소수가 하나 이상 있는 입력만 주어짐
        //한 줄에 하나씩, 증가하는 순서대로 소수를 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        prime = new boolean[N + 1];
        find_prime();

        for(int i = M; i <= N; i++) {
            //false = 소수
            if(!prime[i]) sb.append(i).append('\n');
        }

        System.out.println(sb);
    }

    static void find_prime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {

            // 아직 2가 false니깐 2는 소수.
            if(prime[i]) continue;

            //i=2부터 j값을 도출해서 i의 배수 값들은 다 소수가 아닌걸로.
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

}
