package programmers2;

import java.util.Arrays;

public class MakeMinValue {
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;

        // 둘 다 오름차순으로 정렬 후,
        // B는 뒤 인덱스부터 곱해야 최소가 됨.
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}
