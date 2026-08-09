class Solution {
    public int arrangeCoins(int n) {
        int rows = 0;
        for (int i = 1; i <= n; i++) {
            if (n >= i) {
                n -= i;
                rows++;
            } else {
                break;
            }
        }
        return rows;
    }
}