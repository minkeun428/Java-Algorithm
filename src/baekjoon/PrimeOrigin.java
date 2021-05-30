package baekjoon;

import java.util.Scanner;

/*
 * N이하의 모든 소수를 구하는 알고리즘 (에라토스테네스의 체)
 * 소수를 구하는 대표적인 방법 중 하나
 * k=2부터 루트N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외
 * 시간 복잡도 : O(N㏒(㏒N))
 */
public class PrimeOrigin {

    public static boolean[] prime;  //소수를 체크할 배열
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        make_prime(N);

        for(int i = 0; i < prime.length; i++) {

            if(prime[i] == false) {  //소수(false)일 경우 출력
                System.out.println(i);
            }
        }
    }

    // N이하 소수 생성 메소드
    public static void make_prime(int N) {
        prime = new boolean[N + 1];  //0 ~ N

        /*
        * 소수가 아닌 index = true
        * 소수인 index = false
        * */

        // 2미만의 N을 입력 받으면 소수는 판별한 필요가 없으므로 바로 return
        if(N < 2) {
            return;
        }

        prime[0] = prime[1] = true;

        System.out.println(Math.sqrt(N));
        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(N); i++) {

            //이미 체크된 배열이면 다음 반복문으로 skip
            if(prime[i] == true) {
                continue;
            }

            // i의 배수들을 걸러주기 위한 반복문(본인을 제외하고 배수가 소수에 있으면 안되니깐)
            // ex) 2, 4, 6,...9,..., 25,...
            for(int j = i*i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }

    }
}
