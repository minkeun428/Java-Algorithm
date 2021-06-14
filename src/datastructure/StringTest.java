package datastructure;

public class StringTest {
    public static void main(String[] args) {

        int[][] abc = { {1,2,3,4}
                      , {5,6,7} };
        int[][] def = abc.clone();

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("abc TEST : " + abc[i][j]);
                System.out.println("def TEST : " + def[i][j]);
            }
        }

        Runnable r = new Runnable() {
            public void run() {
                System.out.println("run!!");
            }
        };

        Runnable r2 = () -> {
            System.out.println("run!!");
        };

    }
}
