package programmers1;

public class CaesarPw {
    public String Solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + n);
                if (ch > 'z') {
                    ch -= 26;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + n);
                if (ch > 'Z') {
                    ch -= 26;
                }
            }

            sb.append(ch);
        }

        answer = new String(sb);

        return answer;
    }
}
