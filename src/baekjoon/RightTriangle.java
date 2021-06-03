package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightTriangle {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);

            if(x == 0 && y == 0 && z == 0) break;

            if(z * z == (x * x + y * y)) {
                sb.append("right").append('\n');
            }
            else if(x * x == (y * y + z * z)) {
                sb.append("right").append('\n');
            }
            else if(y * y == (z * z + x * x)) {
                sb.append("right").append('\n');
            }
            else {
                sb.append("wrong").append('\n');
            }
        }

        System.out.println(sb);
    }
}
