package programmers1;

public class EuclideanMethodDiv {
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];

        // 최대 공약수 구하기
        answer[0] = makeDiv(n ,m);

        // 최소 공배수 구하기
        //answer[1] = answer[0] * (n / answer[0]) * (m / answer[0]);
        answer[1] = (n * m) / answer[0];

        return answer;
    }


    // n*m직사각형을 m의 정사각형으로 계속 만들어주다 0일 때 최종 리턴한다.
    public int makeDiv(int n, int m) {
        if(m == 0) return n;

        return makeDiv(m, n % m);
    }
}
