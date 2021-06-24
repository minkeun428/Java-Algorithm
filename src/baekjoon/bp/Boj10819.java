package baekjoon.bp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj10819 {
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 값 받기
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬을 해야 대소 비교 순열의 효율성을 높여준다.
        Arrays.sort(arr);
        perm(arr, 0, N);

        System.out.println(max);
    }

    // 모든 순열 배열 만들기
    public static void perm(int[] arr, int depth, int n) {
        if(depth == n) {
            getSum(arr, n);
            return;
        }
        for(int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n);
            swap(arr, i ,depth);
        }
    }

    // 인덱스 자리 바꾸기 함수
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // 차이 합 리턴 함수
    public static void getSum(int[] arr, int n) {
        int sum = 0;
        for(int i = 2; i <= n; i++) {
            sum += Math.abs(arr[i - 2] - arr[i - 1]);
        }
        if(max < sum) {
            max = sum;
        }
    }

}
