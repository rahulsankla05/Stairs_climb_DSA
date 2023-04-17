package DP_basic_advance;

public class Min_steps {
    int mod = 1000000007;
    public int climbStairs(int A) {
        int ways[] = new int[A + 1]; // ways[i] denotes the number of ways to reach the i'th step.

        if (A == 1) {
            return 1;
        }

        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= A; i++) {
            ways[i] = (ways[i - 1] + ways[i - 2])%mod;
        }
        return ways[A];
    }
}
