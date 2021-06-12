package programmers1;

public class Average {
    public double solution1(int[] arr) {
        double answer = 0;
        double sum = 0;
        int leng = arr.length;

        for(int i = 0; i < leng; i++) {
            sum += arr[i];
        }

        answer = sum / leng;

        return answer;
    }

    // for-each문을 사용한 다른 사람 풀이
    public double solution2(int[] arr) {
        double answer = 0;
        double sum = 0;
        int leng = arr.length;

        for(int i : arr) {
            sum += i;
        }

        answer = sum / leng;

        return answer;
    }
}
