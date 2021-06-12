package programmers1;

public class Hashads {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int sum = 0;
            int chk = x;

            while(chk != 0) {
                sum += chk % 10;
                chk /= 10;
            }

            // 밑의 코드처럼 하면 chk에 마지막 값들 못 넣고 나가버림
            // while(chk / 10 != 0) {
            //     sum += chk % 10;
            //     chk /= 10;
            // }

            if(x % sum != 0) {
                answer = false;
            }

            return answer;
        }
    }
}
