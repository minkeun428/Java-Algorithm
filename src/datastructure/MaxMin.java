package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        //System.out.println(max4(a, b, c, d));
        System.out.println(min4(a, b, c, d));

    }

    // 4개의 최댓값 구하는 메소드
    static int max4(int a, int b, int c, int d) {
        int max = 0;
        max = a;

        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;

        return max;
    }

    // 4개의 최솟값 구하는 메서드
    static int min4(int a, int b, int c, int d) {
        int min = 0;
        min = a;

        if(min > b) min = b;
        if(min > c) min = c;
        if(min > d) min = d;

        return min;
    }

}
