package programmers2;

public class ExpressionOfNum {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }

    // 다른 사람 풀이
    // 정수론 정리 : 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는
    // 주어진 수의 홀수의 약수의 갯수와 같다
    public int expressions(int num) {       //num이 15일 때
        int answer = 0;
        for (int i = 1; i <= num; i += 2) {
            if (num % i == 0) {  // i = 1,3,5,7,9,11,13,15 -> 1,3,5,15 -> 총 4개
                answer++;
            }
        }
        return answer;
    }
}
