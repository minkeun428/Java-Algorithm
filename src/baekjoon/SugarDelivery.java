package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(true) {
            //5로 떨어진다면, 가장 베스트이다
            if(N % 5 == 0) {
                cnt += N / 5;
                break;
            }
            //5로 안 떨어진다면 -3을 하면서 카운트하기 (최소한의 수로 절감 - 최대한 5kg로 나눠야 하므로)
            else {
                N -= 3;
                cnt++;

                //-3을 했는데도 5로 안 떨어지고, 마이너스라면 계산 불가함
                if(N < 0) {
                    cnt = -1;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
