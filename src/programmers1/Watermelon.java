package programmers1;

public class Watermelon {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String str = i % 2 == 0 ? "수" : "박";
            sb.append(str);
        }

        answer = String.valueOf(sb);

        return answer;
    }
}
