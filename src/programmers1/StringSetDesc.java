package programmers1;

import java.util.Arrays;

public class StringSetDesc {
    public String solution(String s) {
        String answer = "";

        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        StringBuilder sb = new StringBuilder(new String(ch));

        sb.reverse().toString();
        answer = new String(sb);

        return answer;
    }
}
