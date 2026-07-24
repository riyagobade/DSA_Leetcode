class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX = 2048;
        boolean[][] dp = new boolean[4][MAX];
        dp[0][0] = true;
        for (int num : nums) {
            boolean[][] next = new boolean[4][MAX];
            for (int k = 0; k <= 3; k++) {
                System.arraycopy(dp[k], 0, next[k], 0, MAX);
            }
            for (int k = 0; k < 3; k++) {
                for (int x = 0; x < MAX; x++) {
                    if (dp[k][x]) {
                        next[k + 1][x ^ num] = true;
                    }
                }
            }
            dp = next;
        }
        boolean[] ans = new boolean[MAX];
        for (int x : nums) ans[x] = true;
        for (int x = 0; x < MAX; x++) {
            if (dp[3][x]) ans[x] = true;
        }
        int res = 0;
        for (boolean b : ans) if (b) res++;
        return res;
    }
}