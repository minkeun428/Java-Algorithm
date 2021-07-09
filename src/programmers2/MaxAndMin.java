package programmers2;

import java.util.StringTokenizer;

public class MaxAndMin {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(s, " ");
        StringTokenizer st2 = new StringTokenizer(s, " ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(st1.hasMoreTokens()) {
            max = Math.max(max, Integer.parseInt(st1.nextToken()));
        }
        while(st2.hasMoreTokens()) {
            min = Math.min(min, Integer.parseInt(st2.nextToken()));
        }

        sb.append(min).append(" ").append(max);
        answer = String.valueOf(sb);

        return answer;
    }
}
