package baekjoon.bp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj10819 {
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
        int answer = 0;
        do {
            answer = Math.max(answer, getSum(arr));
        } while(nextPermutation(arr));

        System.out.println(answer);
    }

    // 모든 순열 배열 만들기
    public static boolean nextPermutation(int[] arr) {
        int i = arr.length - 1;
        while(i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }
        if(i <= 0) return false;

        int j = arr.length - 1;
        while(arr[j] <= arr[i - 1]) {
            j--;
        }
        swap(arr, i - 1, j);
        j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

        return true;
    }

    // 인덱스 자리 바꾸기 함수
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // 차이 합 리턴 함수
    public static int getSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);
        }

        return sum;
    }

}
