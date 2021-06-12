package programmers1;

public class CollatzGuess {

    // 첫 번째 시도 -> 626331 입력하면 시간 초과남.
    public int solution1(int num) {
        int answer = 0;
        if(num == 1) return answer;

        while(num != 1) {
            if(answer == 500) {
                answer = -1;
                break;
            }
            if(num % 2 == 0) {  // 짝수라면,
                num = num / 2;
                answer++;
                continue;
            }
            if(num % 2 == 1) { // 홀수라면,
                num = (num * 3) + 1;
                answer++;
                continue;
            }
        }
        return answer;
    }

    // 두 번째 시도 - 삼항 연산자를 통해 더 깔끔, (num * 3)이 int값을 초과하는 경우가 있어서 long변환 해줘야 함.
    public int solution2(int num) {
        long n = (long)num;
        int answer = 0;
        if(n == 1) return answer;

        while(n != 1) {
            if(answer == 500) {
                answer = -1;
                break;
            }

            n = n % 2 == 0 ? n / 2 : (n * 3) + 1;
            answer++;
        }

        return answer;
    }

}
