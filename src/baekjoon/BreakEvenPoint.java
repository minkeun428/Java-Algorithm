package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {
    public static void main (String[] args) throws IOException {

        //br.readLine()은 문자열로 데이터를 읽음.
        //int형으로 꺼내서 쓰고자 한다면 Integer.parseInt()로 형변환을 해줘야 함.
        //또한, br.readLine()은 한 줄을 통쨰로 읽기 때문에
        //문자열 분리를 위해 StringTokenizer를 사용하여 공백 단위로 문자열을 분리함.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int staticCost = Integer.parseInt(st.nextToken()); //고정 비용
        int changeCost = Integer.parseInt(st.nextToken()); //가변 비용
        int itemCost = Integer.parseInt(st.nextToken());   //상품 가격

        if(itemCost <= changeCost) {
            System.out.println("-1");
        }else {
            System.out.println((staticCost / (itemCost - changeCost))+1);
        }

    }

}
