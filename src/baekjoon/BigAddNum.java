package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BigAddNum {
    public static void main(String args[]) throws IOException {

        //BigInteger의 범위 : -2의 Integer.MAX_VALUE승 ~ 2의 Integer.MAX_VALUE승
        //Integer.MAX_VALUE == 2147483647
        //System.out.println(Integer.MAX_VALUE);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        A = A.add(B);

        System.out.println(A.toString()); //10진수 문자열로 반환

        //System.out.println(A.getClass().getName());  //java.math.BigInteger
        //System.out.println(A.toString().getClass().getName());  //java.lang.String

    }
}
