package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepaintChessboard {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        //배열 입력
        for(int i = 0; i < N; i++) {
            String str = br.readLine();

            for(int j = 0; j < M; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true;
                }
                else {
                    arr[i][j] = false;
                }
            }
        }


    }
}
