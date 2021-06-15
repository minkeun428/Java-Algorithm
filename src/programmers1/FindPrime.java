package programmers1;

public class FindPrime {
    public boolean[] prime;

    public int solution(int n) {
        int answer = 0;

        // 배열 인덱스에 매칭된 수로 소수 셋팅하기
        prime = new boolean[n + 1];
        find_prime(n);

        // 2부터 검사
        for(int i = 2; i <= n; i++) {
            // false이면 소수
            if(!prime[i]) answer++;
        }

        return answer;
    }

    public void find_prime(int n) {
        // prime[0] = prime[1] = true; -> 2부터 검사하기 때문에

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {     // 중복 제거를 위해 반복은 제곱근까지만.
            if(prime[i]) continue;

            for(int j = i * i; j < prime.length; j += i) {  // ex) i=2로 들어오면, j는 4, 6, 8...에서 변환해줘야 함.
                prime[j] = true;                            //  2~n까지 탐색.
            }
        }

    }
}
