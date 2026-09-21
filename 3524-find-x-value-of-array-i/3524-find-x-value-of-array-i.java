class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];

        // dp[r] = number of subarrays ending at the previous index
        // whose product % k == r
        long[] dp = new long[k];

        for (int num : nums) {
            long[] next = new long[k];

            int value = num % k;

            // Start a new subarray with only nums[i]
            next[value]++;

            // Extend every previous subarray
            for (int r = 0; r < k; r++) {
                if (dp[r] > 0) {
                    int newRemainder = (r * value) % k;
                    next[newRemainder] += dp[r];
                }
            }

            // All subarrays ending at current index
            // contribute to the final answer
            for (int r = 0; r < k; r++) {
                result[r] += next[r];
            }

            dp = next;
        }
        return result;
    }
}