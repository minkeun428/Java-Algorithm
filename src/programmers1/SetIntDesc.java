package programmers1;

import java.util.Arrays;

public class SetIntDesc {

    public long solution(long n) {
        long answer = 0;

        String str = String.valueOf(n);

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        StringBuilder answer1 = new StringBuilder(new String(arr));
        answer1.reverse().toString();

        answer = Long.parseLong(new String(answer1));

        return answer;
    }

}
