package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj14502 {
    static int N, M;
    static int[][] map;
    static int[][] copyMap;
    static int max = 0;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 0) {    //첫 빈 공간 발견
                    map[i][j] = 1;  //첫 벽 세우기
                    dfs(1);   //탐색 시작
                    map[i][j] = 0;  //두 번째 케이스를 위한 초기화
                }
            }
        }

        System.out.println(max);
    }

    // 완전탐색 + 백트래킹으로 벽 3개 세우기
    static void dfs(int count) {
        if(count == 3) {
            bfs();
            return;
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 0) {        // 빈 공간 발견
                    map[i][j] = 1;          // 벽 세우기
                    dfs(count + 1);   // dfs로 벽 3개 세울 때까지 반복
                    map[i][j] = 0;          // 세운 벽 허물기
                }
            }
        }
    }

    // 0인 곳에 2(바이러스) 채우기
    static void bfs() {
        copyMap = new int[N][M];

        // 맵 복사하기
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                copyMap[i][j] = map[i][j];
            }
        }

        Queue<Point> q = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(copyMap[i][j] == 2) {
                    q.offer(new Point(i, j));
                }
            }
        }

        while(!q.isEmpty()) {
            Point p = q.poll();
            int x = p.x;
            int y = p.y;

            //4방향 탐색
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < N && ny < M) {    //map의 범위
                    if(copyMap[nx][ny] == 0) { // 빈 공간 -> 바이러스 침투
                        copyMap[nx][ny] = 2;
                        q.offer(new Point(nx, ny));
                    }
                }
            }

        }

        max = checkSafeArea();
    }

    // 안전영역 갯수 구하기
    static int checkSafeArea() {
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(copyMap[i][j] == 0) {
                    cnt++;
                }
            }
        }

        return Math.max(max, cnt);
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
