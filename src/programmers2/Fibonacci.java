package programmers2;

public class Fibonacci {
    public long solution(int n) {
        int answer = 0;

        // 이렇게 되면 피보나치 수가 int형 범위를 초과함
        // O(2^n)시간이 걸리므로 시간 초과남
        // 반복문으로 풀어야 함
        //answer = fibonacci(n) % 1234567;
        int num1 = 0;
        int num2 = 1;
        int sum = 1;

        for(int i = 0; i < n; i++) {
            sum = (num1 + num2) % 1234567;
            num1 = (num2) % 1234567;
            num2 = (sum) % 1234567;
        }

        answer = num1;

        return answer;
    }

//     public int fibonacci(int n) {
//         if(n == 0) return 0;
//         if(n == 1) return 1;

//         return fibonacci(n - 1) + fibonacci(n - 2);
//     }
}
