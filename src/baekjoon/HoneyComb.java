package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoneyComb {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int range = 2;  //범위 초기값 (1은 예외 케이스)
        int count = 0;  //지나가는 방 갯수

        if(N == 1) {   //1일땐 무조건 1번
            System.out.println(1);
        }

        else {   //2부터 계산 시작

            //범위가 주어진 수보다 작을 때까지 반복
            while(range <= N) {
                //방 범위의 최솟값의 규칙을 구하면,
                //6의 배수 형태로 증가
                range = range + (6*count);

                //지나가는 방 갯수 증가
                count++;
            }
            System.out.println(count);
        }

    }
}
