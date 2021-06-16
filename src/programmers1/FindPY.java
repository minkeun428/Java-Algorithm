package programmers1;

public class FindPY {
    boolean solution(String s) {
        boolean answer = true;
        String[] str = s.split("");
        int p = 0;
        int y = 0;

        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("p") || str[i].equals("P")) {
                p++;
            }
            else if(str[i].equals("y") || str[i].equals("Y")) {
                y++;
            }
        }

        if(p != y) {
            answer = false;
        }

        return answer;
    }

    // 다른 사람 풀이
    boolean solution2(String s) {
        s = s.toLowerCase();
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') {
                count++;
            }
            else if(s.charAt(i) == 'y') {
                count--;
            }
        }

        if(count == 0) {
            return true;
        }else {
            return false;
        }
    }

}
