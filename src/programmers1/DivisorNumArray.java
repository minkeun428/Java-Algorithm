package programmers1;

import java.util.Arrays;

public class DivisorNumArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;
        int idx = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                cnt++;
            }
        }

        answer = new int[cnt];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[idx] = arr[i];
                idx++;
            }
        }

        if(idx == 0) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            Arrays.sort(answer);
        }

        return answer;
    }
}
