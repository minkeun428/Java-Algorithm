package programmers1;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for(int i : d) {
            sum += i;
            if(sum > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }

}
