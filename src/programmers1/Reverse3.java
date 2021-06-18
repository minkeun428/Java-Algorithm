package programmers1;

public class Reverse3 {
    public int solution1(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        answer = Integer.valueOf(String.valueOf(sb), 3);

        return answer;
    }

    // 다른 사람 풀이
    public int solution2(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;  //String 객체 생성됨
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();

        return Integer.parseInt(a,3);   //a자리는 String만 가능함
    }
}
