package programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringOnmywqy {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                // n번째 문자가 같을 경우에 원본 스트링을 사전순으로
                if(c1 == c2){
                    return s1.compareTo(s2);
                }
                else {
                    return c1 - c2;
                }
            }

        });

        return strings;
    }

    //다른 사람 풀이 -> 해당 인덱스 문자를 맨 앞에 붙여서, sort한 후에 앞 문자 제거 후 리턴
    public String[] solution2(String[] strings, int n) {

        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }

        return answer;
    }

}
