package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dungchi {
    public static void main(String[] args) throws IOException {

        /**
         * Idea -> 내 순위가 올라갈라면 이미 나를 탐색했어도, 나도 0인덱스부터 탐색해야 한다.
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        String[] str;
        for(int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int rank = 1;    //rank는 1부터 시작

            for(int j = 0; j < N; j++) {
                if(i == j) continue;

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }

            sb.append(rank).append(' ');
        }

        System.out.println(sb);
    }
}
