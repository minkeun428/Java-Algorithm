package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailClimbUp {
    public static void main(String[] args) throws IOException {

        //문제에서 공백으로 나뉘어진다 했다.
        //br.readLine()은 문자열로 데이터를 읽으며
        //StringTokenizer로 문자열 분리 후, 해당 토큰에 저장한다.
        //따라서, 공백을 입력할 때마다 int형으로 변환하여 해당 변수에 넣어준다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int dayMeter = Integer.parseInt(st.nextToken());
        int nightMeter = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int count = 0;

        //나누기 연산을 통해 알고리즘 최적화(다른 방법은 시간 초과남)
        count = (height - nightMeter) / (dayMeter - nightMeter);

        //나머지가 딱 떨어지지 않는다면 하루가 더 걸린다는 것.
        if( (height - nightMeter) % (dayMeter - nightMeter) != 0) {
            count++;
        }

        System.out.println(count);
    }
}
