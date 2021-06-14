package datastructure.que;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 원하는 갯수만큼 값을 입력 받아 요솟수가 N인 배열에 마지막 N개를 저장
public class LastNElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = 10;
        int[] a = new int[N];    // 입력 받은 값을 저장
        int cnt = 0;             // 입력 받은 갯수
        int retry;               // 다시 한 번?

        System.out.println("정수를 입력하세요.");

        do {
            System.out.printf("%d번 째 정수 : ", cnt  + 1);
            a[cnt++ % N] = Integer.parseInt(br.readLine());

            System.out.println("계속 할까요? (예. 1 / 아니오. 0) :");
            retry = Integer.parseInt(br.readLine());
        } while (retry == 1);

        int i = cnt - N;
        if (i < 0) i = 0;

        for( ; i < cnt; i++) {
            System.out.printf("%2d번 째의 정수 = %d\n", i + 1, a[i % N]);
        }
    }
}
