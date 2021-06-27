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

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<Dot> q = new LinkedList<>();
        q.add(new Dot(0, 0));
        int count = 1;

        while(!q.isEmpty()) {
            int size = q.size();
            count++;

            for(int t = 0; t < size; t++) {
                Dot d = q.poll();   //가장 먼저 넣은거 꺼내고 반환

                for (int i = 0; i < 4; i++) {
                    int ddx = d.x + dx[i];
                    int ddy = d.y + dy[i];

                    if (isValid(ddx, ddy)) {
                        if (N - 1 == ddx && M - 1 == ddy) return count;
                        if (arr[ddx][ddy] == 1 && !chk[ddx][ddy]) {
                            //다음에 방문할 좌표를 큐에 넣는다.
                            q.add(new Dot(ddx, ddy));

                            //다음 좌표는 방문했음으로 표시
                            chk[ddx][ddy] = true;
                        }
                    }
                }
            }
        }
        return 0;
    }

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