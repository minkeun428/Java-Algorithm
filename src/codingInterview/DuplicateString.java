package codingInterview;

import java.util.HashMap;
import java.util.Map;

//문자열 1.1
public class DuplicateString {

    //방법 1
    public boolean checkString(String s) {
        Map<Character, Integer> map = new HashMap();

        char ch[] = new char[s.length()];
        for(int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }

        for(int i = 0; i < ch.length; i++) {
            System.out.println("map value::" + map.get(ch[i]));
            if(map.containsKey(ch[i])) {    //해당 문자로 된 key가 존재하는지 확인 -> 문자 중복!
                return true;
            }
            map.put(ch[i], i);  // key:문자, value:인덱스
        }
        return false;
    }

    //방법 2
    public boolean isUniqueChars(String str) {
        if(str.length() > 128) return false;        //아스키 문자열이므로 (7비트의 이진수 조 -> 총128개)
        boolean[] char_set = new boolean[128];      //각 인덱스의 int값 체크

        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcdc";

        DuplicateString sd = new DuplicateString();
        if(sd.checkString(str)) {
            System.out.println("중복 문자 있음!!");
        }else {
            System.out.println("중복 문자 없음!!");
        }

        String str2 = "ddaac";
        if(!sd.isUniqueChars(str2)) {
            System.out.println("중복 문자 있음!!");
        }else {
            System.out.println("중복 문자 없음!!");
        }

    }
}
