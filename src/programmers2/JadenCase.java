package programmers2;

public class JadenCase {

    public void solution(String s) {
        String[] str = s.split("");
        StringBuilder sb = new StringBuilder();

        if(Character.isLowerCase(str[0].charAt(0))) {
            sb.append(str[0].toUpperCase());
        }else {
            sb.append(str[0]);
        }
        for(int i = 1; i < str.length; i++) {
            if(str[i - 1].equals(" ") && Character.isLowerCase(str[i].charAt(0))) {
                sb.append(str[i].toUpperCase());
            }
            else if(!str[i - 1].equals(" ") && Character.isUpperCase(str[i].charAt(0))) {
                sb.append(str[i].toLowerCase());
            }
            else {
                sb.append(str[i]);
            }
        }

        System.out.println("sb::" + sb);
    }

    // 다른 풀이 -> 애초에 다 소문자로 변경 후, 앞 글자와 띄어쓰기 다음 글자만 대문자로 변경한다.
    public void solution1(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();

        if(Character.isLowerCase(str[0].charAt(0))) {
            sb.append(str[0].toUpperCase());
        }else {
            sb.append(str[0]);
        }

        for(int i = 1; i < str.length; i++) {
            if(str[i - 1].equals(" ")) {
                sb.append(str[i].toUpperCase());
            }else {
                sb.append(str[i]);
            }
        }

        System.out.println("sb::" + sb);
    }

    public static void main(String[] args) {
        String answer = "for the last week";

        JadenCase jc = new JadenCase();
        jc.solution(answer);
    }
}
