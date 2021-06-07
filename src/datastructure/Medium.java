package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Medium {
    public static void main(String[] args) throws IOException {

        //세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하라.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(med3(a, b, c));

    }

    //효율적인 중앙값 메소드
    static int med3(int a, int b, int c) {
        if(a >= b) {
            if(b >= c) {
                return b;
            }else if(a <= c) {
                return a;
            }else {  // a > c
                return c;
            }
        }
        else if(a > c) {
            return a;
        }
        else if(b > c) {
            return c;
        }else {
            return b;
        }
    }

    // 비효율적인 중앙값 메소드
    // b >= a 와 b <= a의 판단을 뒤집은 판단을
    // 이후 else if 문에서도 같은 판단을 수행하므로
    // 효율이 나빠짐.
    static int wrongMed3(int a, int b, int c) {
        if((b >= a && c <= a) || (b <= a && c>= a)) {
            return a;
        }
        else if((a > b && c < b) || (a < b && c > b)) {
            return b;
        }
        else {
            return c;
        }
    }

}
