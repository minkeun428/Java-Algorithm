package programmers1;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];

        for (int i = 0; i < n; i++) {
            String tmp = Integer.toBinaryString(arr1[i] | arr2[i]);  // OR비트 연산 실행
            tmp = String.format("%" + n + "s", tmp);        // tmp 길이가 n보다 작으면 String 타입으로 0 추가
            tmp = tmp.replaceAll("1", "#");
            tmp = tmp.replaceAll("0", " ");
            answer[i] = tmp;    // 한 줄 완성
        }
        return answer;
    }
}
