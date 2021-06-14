package programmers1;

public class IntSqrtPow {

    //내 풀이
    public long solution(long n) {
        long answer = 0;

        if((long)Math.sqrt(n) * (long)Math.sqrt(n) == n) {
            answer = (long)(Math.sqrt(n) + 1) * (long)(Math.sqrt(n) + 1);
        }
        else {
            answer = -1;
        }

        return answer;
    }

    //다른 사람 풀이
    public long solution2(long n) {
        long answer = 0;

        //pow(n, a) -> n의 a승
        if(Math.pow((int)Math.sqrt(n), 2) == n) {
            answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
        }

        return answer;
    }

}
