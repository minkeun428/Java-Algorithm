package programmers1;

public class HidePhoneNumber {
    public String solution1(String phone_number) {
        String answer = "";
        int leng = phone_number.length();
        char[] ch = new char[leng];

        for(int i = 0; i < leng; i++) {
            ch[i] = phone_number.charAt(i);   //toCharArray()로 바로 가능하긴 함
        }

        for(int i = 0; i < leng - 4; i++) {
            ch[i] = '*';
        }

        answer = String.copyValueOf(ch);  // char 배열이 값을 String으로 변환

        return answer;
    }

    // 다른 사람의 풀이
    public String solution2(String phone_number) {
        String answer = "";
        char[] ch = phone_number.toCharArray();  // String 값을 char 배열로 변환

        for(int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }

        answer = String.valueOf(ch);   // valueOf메소드 자체가 여러 다른 타입들을 String 값으로 변환해줌

        return answer;
    }


}
