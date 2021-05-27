package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AcmHotel {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int YY = 0;
        int XX = 0;

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int floor = Integer.parseInt(st.nextToken());  //층수
            int N = Integer.parseInt(st.nextToken());      //N번째 손님
            st.nextToken();  //넓이는 무시해도 됨.

            if(N % floor == 0) {  //나머지가 0일 땐, 꼭대기층이면서 나눈 몫의 값이 호수이다.
                YY = floor * 100;
                XX = N / floor;
            }else { //나머지가 존재할 땐, 나머지가 층수이면서 몫+1이 호수이다.
                YY = (N % floor) * 100;
                XX = (N / floor) + 1;
            }

            sb.append(YY + XX).append('\n');
        }

        System.out.println(sb);

    }
}
