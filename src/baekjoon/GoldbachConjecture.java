package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachConjecture {
    static boolean prime[] = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        make_prime();

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int left = n / 2;
            int right = n / 2;

            while(true) {
                if(!prime[left] && !prime[right]) {
                    sb.append(left).append(" ").append(right).append('\n');
                    break;
                }

                left--;
                right++;
            }

        }
        System.out.println(sb);
    }

    static void make_prime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;

            for(int j = i * i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }


}
