package programmers1;

public class GetMiddleNum {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int idx = length / 2;

        String[] arr = s.split("");

        if(length % 2 == 0) {
            answer = arr[idx - 1] + arr[idx];
        } else {
            answer = arr[idx];
        }

        return answer;
    }

    // 다른 사람 풀이
    String getMiddle(String word){
        int a = word.length();
        String word1;

        if ( a % 2 == 0 )
            word1 = word.substring(a/2 - 1, (a/2) + 1);
        else
            word1 = word.substring((a/2), (a/2) + 1);

        return word1;
    }

}
