package programmers1;

public class ControlString {

    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if(ch < '0' || ch > '9') {
                    answer = false;
                    break;
                }
                else {
                    answer = true;
                }
            }
        }
        else {
            answer = false;
        }

        return answer;
    }

    // 다른 사람 풀이
    public boolean solution1(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6)
            return s.matches("(^[0-9]*$)");
        else {
            return false;
        }

    }

}
