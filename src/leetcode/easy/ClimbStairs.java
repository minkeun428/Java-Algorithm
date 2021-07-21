package leetcode.easy;

// https://leetcode.com/problems/climbing-stairs/description
// 다이나믹 프로그래밍 -> 점화식을 찾아야 한다.
public class ClimbStairs {
    public int climbStairs(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;

        int[] d = new int[n + 1];
        d[1] = 1;
        d[2] = 2;

        for(int i = 3; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }

        return d[n];
    }
}
