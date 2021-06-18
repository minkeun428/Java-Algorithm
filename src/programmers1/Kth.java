package programmers1;

import java.util.Arrays;

public class Kth {
    public int[] solution1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int pre = commands[i][0] - 1;
            int back = commands[i][1];
            int tmp = commands[i][2];
            int[] arr = new int[back - pre];
            int idx = 0;

            for(int j = pre; j < back; j++) {
                arr[idx] = array[j];
                idx++;
            }

            Arrays.sort(arr);
            answer[i] = arr[tmp - 1];
        }

        return answer;
    }


    // 다른 사람 풀이 - 퀵 정렬
    public int[] solution2(int[] array, int[][] commands) {
        int n = 0;
        int[] ret = new int[commands.length];

        while(n < commands.length){
            int m = commands[n][1] - commands[n][0] + 1;

            if(m == 1){
                ret[n] = array[commands[n++][0]-1];
                continue;
            }

            int[] a = new int[m];
            int j = 0;
            for(int i = commands[n][0]-1; i < commands[n][1]; i++)
                a[j++] = array[i];

            sort(a, 0, m-1);

            ret[n] = a[commands[n++][2]-1];
        }

        return ret;
    }

    void sort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int x = a[(pl+pr)/2];

        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr){
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        }while(pl <= pr);

        if(left < pr) sort(a, left, pr);
        if(right > pl) sort(a, pl, right);
    }

}
