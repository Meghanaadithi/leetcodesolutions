class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return rec(0, n, dp);
    }

    private int rec(int i, int n, int[] dp) {
        if (i >= n) {
            return i == n ? 1 : 0;
        }

        if (dp[i] != -1) return dp[i];

        dp[i] = rec(i + 1, n, dp) + rec(i + 2, n, dp);
        return dp[i];
    }
}
