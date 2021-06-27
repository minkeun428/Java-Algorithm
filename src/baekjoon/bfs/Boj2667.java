package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Boj2667 {
    static int N;
    static int[][] Map;
    static int count;    // 단지집의 숫자
    static int[] dx = {-1, 1, 0, 0};    // 상하좌우
    static int[] dy = {0, 0, -1, 1};    // 상하좌우

    static ArrayList<Integer> result;    // 단지 집 수 저장
    static boolean[][] check;    // 방문 체크

    // 재귀로 푼 BFS
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());    // 지도의 크기

        //2차원 배열 지도
        Map = new int[N][N];
        //방문 체크
        check = new boolean[N][N];

        //지도 배열 값 입력
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int j = 0; j < N; j++) {
                Map[i][j] = str.charAt(j) - '0';
            }
        }

        //단지집의 숫자
        count = 0;
        //단지 집의 수 결과 저장
        result = new ArrayList();

        //지도 전체 탐색
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(Map[i][j] == 1 && !check[i][j]) {  //현재 위치 값이 1이고, 방문하지 않았다면
                    count = 1;
                    search(i, j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int rtn : result) {
            System.out.println(rtn);
        }

    }

    public static int search(int x, int y) {
        check[x][y] = true;   //해당 위치 방문함

        //4방향 확인
        for(int i = 0; i < 4; i++) {
            int ddx = x + dx[i];
            int ddy = y + dy[i];

            if(ddx >= 0 && ddy >= 0 && ddx < N && ddy < N) {
                if(Map[ddx][ddy] == 1 && !check[ddx][ddy]) {
                    search(ddx, ddy);
                    count++;
                }
            }
        }

        return count;
    }

}
