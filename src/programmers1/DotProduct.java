package programmers1;

public class DotProduct {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+= a[i]*b[i];
        }

        return sum;
    }
}
