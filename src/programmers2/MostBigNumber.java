package programmers2;

import java.util.Arrays;

public class MostBigNumber {
    public String solution(int[] numbers) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        String[] result = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        // 문자열을 각각 자리 바꾸어 더했을때, 큰수가 앞으로 오게끔 정렬 && 하나의 메소드만 있는 클래스일 때, 람다식 가능
        Arrays.sort(result, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        /* 정렬
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return ((o2 + o1).compareTo(o1 + o2));
            }
        });
        */

        // {0, 0, 0}같이 0으로만 이루어진 배열이 있을 수도 있다
        if(result[0].equals("0")) {
            sb.append("0");
        }else {
            for (String a : result) {
                sb.append(a);
            }
        }

        answer = String.valueOf(sb);
        return answer;
    }

    public static void main(String[] args) {
        MostBigNumber mbn = new MostBigNumber();
        int[] num = {3, 30, 34, 5, 9};

        mbn.solution(num);
    }
}
