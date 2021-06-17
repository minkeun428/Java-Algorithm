package programmers1;

public class KakaoDarts {
    public int solution(String dartResult) {
        int answer = 0;
        char[] dart = dartResult.toCharArray();
        int[] score = new int[3];   // 이 배열 만드는게 문제의 핵심 Point
        int idx = -1;

        // 1. dartResult 문자열 탐색
        for(int i = 0; i < dart.length; i++) {
           if(dart[i] >= '0' && dart[i] <= '9') {
               idx++;
               if(dart[i] == '1' && dart[i + 1] == '0') {
                   score[idx] = 10;
                   i++;
               } else {
                   score[idx] = dart[i] - '0';
               }
           }
           else if(dart[i] == 'D') {
               score[idx] *= score[idx];
           }
           else if(dart[i] == 'T') {
               score[idx] *= score[idx] * score[idx];
           }
           else if(dart[i] == '*') {
               if(idx > 0) {
                   score[idx - 1] *= 2;
               }
               score[idx] *= 2;
           }
           else if(dart[i] == '#') {
               score[idx] *= -1;
           }
       }

        for(int num : score) {
            answer += num;
        }

        return answer;
    }
}
