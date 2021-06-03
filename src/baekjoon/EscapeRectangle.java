package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int xmin = 0;
        int ymin = 0;

        /** Math 클래스를 이용해보자!
         * */
        xmin = Math.min(w-x, x);
        ymin = Math.min(h-y, y);

        System.out.println(Math.min(xmin, ymin));


        /*
        int distance = 0;

        if((h-y) > y) {
            ymin = y;
        }else {
            ymin = h-y;
        }

        if((w-x > x)) {
            xmin = x;
        }else {
            xmin = w-x;
        }

        if(ymin > xmin) {
            distance = xmin;
        }else {
            distance = ymin;
        }

        System.out.println(distance);
        */
    }
}
