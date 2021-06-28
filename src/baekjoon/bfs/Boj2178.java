package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj2178 {
    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] chk;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        chk = new boolean[N][M];
        chk[0][0] = true;

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';  //int형 변환
            }
        }

        bfs(0, 0);
        System.out.println(arr[N - 1][M - 1]);
    }

    static void bfs(int row, int col) {
        Queue<Dot> q = new LinkedList();
        q.offer(new Dot(row, col));
        chk[row][col] = true;

        while(!q.isEmpty()) {
            Dot d = q.poll();

            for (int i = 0; i < 4; i++) {
                int ddx = d.x + dx[i];
                int ddy = d.y + dy[i];

                // (0,5)배열이 돌 땐 여기서 걸려서 continue -> (1,4)배열 탐색으로 감!
                if (!isValid(ddx, ddy) || chk[ddx][ddy] || arr[ddx][ddy] == 0) {
                    continue;
                }else {
                    //count 누적
                    arr[ddx][ddy] = arr[d.x][d.y] + 1;

                    //다음에 방문할 좌표를 큐에 넣는다.
                    q.offer(new Dot(ddx, ddy));

                    //다음 좌표는 방문했음으로 표시
                    chk[ddx][ddy] = true;
                }
            }
        }

    }

    // 4방향 확인 중에, -1이거나 NxM크기의 범위를 넘어선 안된다.
    static boolean isValid(int x, int y) {
        if(x < 0 || x >= N || y < 0 || y >= M) {
            return false;
        }
        else {
            return true;
        }
    }
}

class Dot {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}