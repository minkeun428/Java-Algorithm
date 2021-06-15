package programmers1;

public class StrangeChar {
    public String solution(String s) {
        String answer = "";

        // 문자열 배열 생성
        String[] str = s.split("");

        int idx = 0;
        for(int i = 0; i < str.length; i++) {
            // 공백이면
            if(str[i].equals(" ")) {
                idx = 0;
                continue;
            }
            // 인덱스가 짝수면
            if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            }
            // 인덱스가 홀수면
            else {
                str[i] = str[i].toLowerCase();
                idx++;
            }
        }

        // 다시 문자열 생성
        for(String a : str) {
            answer += a;
        }

        return answer;
    }

    // 다른 사람 풀이
    public String solution2(String s) {
        String answer;

        // 전체를 대문자로 치환
        answer = s.toUpperCase();
        char[] ch = answer.toCharArray();

        // 앞 문자가 대문자라면 소문자로 치환
        for(int i = 1; i < ch.length; i++) {
            if(62 <= ch[i - 1] && ch[i - 1] <= 90) {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        answer = String.valueOf(ch);

        return answer;
    }

}
