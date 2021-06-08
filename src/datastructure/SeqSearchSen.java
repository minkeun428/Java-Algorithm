package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeqSearchSen {
    //선형 검색 보초법으로 실제 반복횟수를 절반으로 줄임.
    //실제 배열 길이 + 1을 하여 맨 끝에 찾고자 하는 수를 임의로 넣는 것.

    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;  // 보초를 추가

        while(true) {
            // if(i == n) return -1; -> 해당 조건문이 생략됨 보초법으로 인해!!
            if(a[i] == key) break;

            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println("배열 길이 : " + num);

        int[] x = new int[num + 1];    //보초 세우기 위해 배열 길이 + 1

        for(int i = 0; i < num; i++) {
            x[i] = Integer.parseInt(br.readLine());
        }

        //검색할 값 입력
        int ky = Integer.parseInt(br.readLine());

        int idx = seqSearchSen(x, num, ky);    //배열 x에서 값이 ky인 요소를 검색

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        }
        else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }

}
