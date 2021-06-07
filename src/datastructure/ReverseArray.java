package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {

    static void reverse(int[] a) {
        for(int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    //a[idx1]과 a[idx2]의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("요솟수 : ");
        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = Integer.parseInt(br.readLine());
        }

        reverse(x);   //배열 a의 요소를 역순으로 정렬

        System.out.println("배열 a를 역순으로 정렬했습니다.");

        for(int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
