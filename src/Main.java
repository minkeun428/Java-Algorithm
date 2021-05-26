import java.io.*;



public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            if(check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];  //boolean의 default값 false
        int prev = 0;
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if(prev != now) {

                if (!check[now - 'a']) {
                    check[now - 'a'] = true; //인덱스 0부터 넣고 싶기 때문에
                    prev = now;
                } else {
                    return false;
                }

            }

        }

        return true;
    }

}