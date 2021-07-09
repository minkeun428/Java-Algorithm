package programmers2;

public class ProductMatrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                for(int k = 0; k < arr1[0].length; k++) {
                    System.out.println("i::" + i);
                    System.out.println("j::" + j);
                    System.out.println("k::" + k);
                    System.out.println();
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductMatrix pm = new ProductMatrix();
        int[][] A = {{1,4}, {3,2}, {4,1}};
        int[][] B = {{2,1}, {4,3}};

        pm.solution(A, B);
    }
}
