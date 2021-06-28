package baekjoon.bp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] arr = new int[N];
        int max = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length - 1; j++) {
                for(int k = j + 1; k < arr.length -2; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(max < sum && sum <= M) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
