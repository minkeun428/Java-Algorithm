package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = sumCheck(arr, N, M);
        System.out.println(result);
    }

    static int sumCheck(int[] arr, int N, int M) {
        int result = 0;

        // 3개를 골라야 하니 첫 번째 카드는 N-2 까지만 순회
        for(int i = 0; i < N - 2; i++) {

            // 두 번째 카드는 첫 번째 카드 다음 부터 N-1 까지만 순회
            for(int j = i + 1; j < N - 1; j++) {

                // 세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
                for(int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if(M == temp) return temp;

                    if(result < temp && temp < M) result = temp;
                }
            }
        }

      return result;
    }

}
