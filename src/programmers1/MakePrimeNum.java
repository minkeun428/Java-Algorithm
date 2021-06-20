package programmers1;

public class MakePrimeNum {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(prime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean prime(int n) {
        boolean rtn = true;
        if(n == 2) rtn = true;

        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0) {
                rtn = false;
                break;
            }
        }

        return rtn;
    }

}
