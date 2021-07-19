package baekjoon.bp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 스타트와 링크
 * */
public class Boj14889 {
    static int N;
    static int[][] map;
    static boolean[] visit;
    static int Min = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visit = new boolean[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combi(0, 0);
        System.out.println(Min);

    }

    // idx는 인덱스, count는 조합 갯수(=재귀 깊이)
    static void combi(int idx, int count) {
        // 팀 조합이 완성될 경우
        if(count == N / 2) {
            diff();
            return;
        }

        for(int i = idx; i < N; i++) {
            //노 방문?
            if(!visit[i]) {
                visit[i] = true;        //방문
                combi(++i, ++count);    //재귀호출
                visit[i] = false;       //재귀 끝나면 비방문
            }
        }
    }

    // 두 팀의 능력치 차이를 계산
    static void diff() {
        int team_start = 0;
        int team_link = 0;

        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {

            }
        }

    }

}
