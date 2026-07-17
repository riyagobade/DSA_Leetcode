class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }
        int[] freq = new int[max + 1];
        for (int x : nums) {
            freq[x]++;
        }
        long[] divisible = new long[max + 1];
        for (int d = 1; d <= max; d++) {
            for (int multiple = d; multiple <= max; multiple += d) {
                divisible[d] += freq[multiple];
            }
        }
        long[] exact = new long[max + 1];
        for (int d = max; d >= 1; d--) {
            long cnt = divisible[d];
            exact[d] = cnt * (cnt - 1) / 2;
            for (int multiple = d * 2; multiple <= max; multiple += d) {
                exact[d] -= exact[multiple];
            }
        }
        long[] prefix = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + exact[i];
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long q = queries[i] + 1; 
            int l = 1;
            int r = max;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (prefix[mid] >= q)
                    r = mid;
                else
                    l = mid + 1;
            }
            ans[i] = l;
        }
        return ans;
    }
}