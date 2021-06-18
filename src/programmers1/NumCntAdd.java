package programmers1;

public class NumCntAdd {

    public int solution1(int left, int right) {
        int answer = 0;
        int count;

        for(int i = left; i <= right; i++) {
            count = make_num(i);
            answer = count % 2 == 0 ? answer + i : answer - i;
        }

        return answer;
    }
    public int make_num(int n) {
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    //다른 사람 풀이
    public int solution2(int left, int right) {
        int answer = 0;
        int count = 0;

        for(int i = left; i <= right; ++i){
            for(int j = 1; j <= i; ++j) {
                if (i % j == 0) count++;
            }
            answer = count % 2 == 0 ? answer + i : answer - i;
        }

        return answer;
    }

}
