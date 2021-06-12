package programmers1;

public class Hashads {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;

            int sib = x / 10;
            int il = x % 10;
            int rtn = sib + il;

            if(x % rtn != 0) {
                answer = false;
            }

            return answer;
        }
    }
}
