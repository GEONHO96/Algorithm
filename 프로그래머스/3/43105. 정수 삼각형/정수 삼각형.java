class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[] dp = triangle[n - 1].clone();
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = triangle[i][j] + Math.max(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }
}