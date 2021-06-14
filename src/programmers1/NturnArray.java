package programmers1;

public class NturnArray {

    // 내 풀이
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        int[] answer = new int[arr.length];

        int idx = 0;
        for (int i = arr.length - 1; i > -1; i--) {
            answer[idx++] = Integer.parseInt(String.valueOf(arr[i]));
        }

        return answer;
    }

    // 다른 사람 풀이
    public int[] solution2(long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);

        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for(int i = 0; i < ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }

        return answer;
    }
}
