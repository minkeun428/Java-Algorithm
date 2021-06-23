package programmers1;

import java.util.ArrayList;
import java.util.Arrays;

public class GiveupMather {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        for(int i = 0; i < answers.length; i++) {
            if(one[i % one.length] == answers[i]) {
                answer1++;
            }
            if(two[i % two.length] == answers[i]) {
                answer2++;
            }
            if(three[i % three.length] == answers[i]) {
                answer3++;
            }
        }

        int max = Math.max(Math.max(answer1, answer2), answer3);

        ArrayList<Integer> list = new ArrayList();
        if(max == answer1) list.add(1);
        if(max == answer2) list.add(2);
        if(max == answer3) list.add(3);

        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

}
