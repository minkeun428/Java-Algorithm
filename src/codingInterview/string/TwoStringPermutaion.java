package codingInterview.string;

import java.util.Arrays;

//문자열 1.2
public class TwoStringPermutaion {
    //방법 1
    public boolean permutation1(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        return sort(s1).equals(sort(s2));
    }

    //방법 2
    //배열 두 개를 이용해서 각 문자열 내의 문자 출현 횟수를 기록하고, 두 배열을 비교
    //두 문자열의 길이와 구성요소가 같아야만 가능한 방법
    public boolean permutation2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] letter = new int[128];    //7비트의 아스키 코드 2의7승개
        char[] s_array = s1.toCharArray(); //{a, b, c, d, e}

        for (char c : s_array) {
            letter[c]++;    //letter[a] -> 'a'의 int형으로 배열에 입력
        }

        //현재, letter배열에는 s1의 문자값들이 각 int형으로 해당 인덱스에 중복횟수만큼 들어있음
        for (int i = 0; i < s2.length(); i++) {
            int c = (int) s2.charAt(i);
            letter[c]--;            //같은 문자일 때마다 -1
            if (letter[c] < 0) return false;        //더 많으면 문제조건이랑 맞지 않음.
        }

        //모든 조건을 완수하고, true 반환
        return true;
    }


    public String sort(String s) {
        char content[] = s.toCharArray();
        Arrays.sort(content);   //sort는 배열형으로만 가능

        return new String(content);
    }

}
