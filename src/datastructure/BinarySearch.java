package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Arrays.binarySearch로 이진 검색.
// 이진 탐색은 오름 차순 같은 순차적 배열일 때 사용함.
public class BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("요솟수 : ");
        int num  = Integer.parseInt(br.readLine());
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");
        x[0] = Integer.parseInt(br.readLine());

        for(int i = 1; i < num; i++) {
            do {
                x[i] = Integer.parseInt(br.readLine());
            } while(x[i] < x[i - 1]);   //바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.println("검색할 값 입력 : ");
        int ky = Integer.parseInt(br.readLine());
        int idx = Arrays.binarySearch(x, ky);    //배열 x에서 키 값이 ky인 인덱스를 검색

        if(idx < 0) {
            //검색에 실패할 경우
            //삽입 포인트는 검색할 값보다 큰 요소 중 첫 번째 요소의 인덱스.
            //삽입 포인트를 x라고 할 때, binarySearch메소드는 -x-1을 반환함.
            System.out.println("삽입 포인트:: " + idx);
            System.out.println("그 값의 요소가 없습니다.");
        }
        else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }

    }
}
