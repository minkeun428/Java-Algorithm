package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNumber {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int crossCount = 1;  //대각선 갯수
        int countSum = 0;    //대각선 갯수의 누적 합

        while(true) {

            //직선 대각선 누적합 + 해당 대각선 갯수 이용한 범위 판별
            if(X <= countSum + crossCount) {

                //대각선의 갯수가 홀수라면,
                if(crossCount % 2 == 1) {
                    //분모는 내림차순, 분자는 오름차순
                    //분모 = 대각선 갯수 - (X - 직전 대각선까지의 누적합 - 1)
                    //분자 = X - 직전 대각선까지의 누적합
                    System.out.println((crossCount - (X - countSum -1)) + "/" + (X - countSum));
                    break;
                }

                else { //대각선의 갯수가 짝수라면, 홀수의 출력 반대로
                    System.out.println((X - countSum) + "/" + (crossCount - (X - countSum -1)));
                    break;
                }

            }else {
                countSum += crossCount;
                crossCount++;
            }
        }

    }
}
