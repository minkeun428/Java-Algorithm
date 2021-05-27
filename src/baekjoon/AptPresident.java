package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AptPresident {

    public static int[][] APT = new int[15][15];  //1<=k, n<=14

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        /***** 위 부분을 가독성 좋게 함수로 만들어보자 *****/
        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1;  //i층 1호
            APT[0][i] = i;  //0층 i호
        }
        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
        /***************************************/

        /*
         * makeAPT();
        */

        for(int i = 0; i < T; i++) {
            int floor = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());
            sb.append(APT[floor][ho]).append('\n');
        }

        System.out.println(sb);
    }

    /*
    public static void makeAPT() {
        //아파트 만들기
        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1;  //i층 1호
            APT[0][i] = i;  //0층 i호
        }
        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
    }
    */

}
