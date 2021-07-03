package programmers2;

import java.util.Arrays;

public class H_index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int leng = citations.length;
        int h = 0;
        int cnt = 0;

        for(int i = 0; i < leng; i++) {
            h = citations[i];
            cnt = leng - i;

            if(cnt <= h) {
                answer = cnt;
                break;
            }
        }

        return answer;
    }
}
