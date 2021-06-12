package programmers1;

public class XdistanceN {

    // 첫 번째 시도 -> 13, 14번 케이스에서 실패 뜸
    public long[] solution1(int x, int n) {
        long[] answer = {};
        answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }

        return answer;
    }

    // 두 번째 시도 -> x * i에서 int형 범위(약+-21억)을 초과하는 경우가 생긴다.
    public long[] solution2(int x, int n) {
        long[] answer = {};
        answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long)x * (i + 1);
        }

        return answer;
    }

    // 다른 사람 풀이 -> 애초에 곱하기 없이 진행.
    public long[] solution3(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }

}
