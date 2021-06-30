/**
 * 좋은 수열인지 나쁜 수열인지 분별하기
 * 길이가 n인 수열에서 인접하면서 동일한 수열이 있는 경우는 동일한 수열의 길이가 최소 1부터 최대 n/2인 경우 발생한다.
 * 123 456일 때 -> 6/2 까지만 동일 수에 대해 판별이 가능하므로.
 * 따라서, 가장 마지막에 넣은 수 기준으로
 * 마지막 1개와 그 앞의 1개의 수가 동일한지,
 * 마지막 2개와 그 앞의 2개의 수가 동일한지,
 * 마지막 3개와 그 앞의 3개의 수가 동일한지,
 * ...
 * 마지막 n/2개와 그 앞의 n/2개의 수가 동일한지 비교해서
 * 한번이라도 동일하다면 나쁜 수열이 된다.
 * 가장 첫 번째로 나오는 백트래킹 알고리즘의 결과가 가장 작은 수 이기 때문에
 * 첫번째에 바로 출력하면 된다.
*/
package baekjoon.bp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2661 {
    static int N;
    static int start = 1;
    static int end = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        backTracking("");
    }

    static void backTracking(String str) {
        if(str.length() == N) {
            System.out.println(str);
            System.exit(0);
            return;
        }

        for(int i = start; i <= end; i++) {
            if(chkCondition(str + i)) { // 1,2,3을 하나씩 붙인 수들이 좋은 수열이라면,
                backTracking(str + i);  // N개가 될 때까지 반복.
            }
        }
    }

    static boolean chkCondition(String str) {
        int len = str.length();
        // ex. 1212가 들어올 경우
        // 한글자씩 비교했을 때는 유효하지만
        // 두글자씩 비교 했을 경우 12 12가 같으므로 유효하지 않음.
        for(int i = 1; i <= len / 2; i++) { // 마지막 들어온 숫자가 그 앞에 1개와 동일한지, 마지막 2개와 그 앞 2개가 동일한지 ....
            String front_str = str.substring(str.length() - i - i, str.length() - i);
            String rear_str = str.substring(str.length() - i);

            if(front_str.equals(rear_str)) {   //동일하면 나쁜 수열
                return false;
            }
        }
        return true;
    }

}
