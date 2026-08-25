class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int n = left; n <= right; n++) {
            int count = Integer.bitCount(n);
            if (isPrime(count)) {
                ans++;
            }
        }
        return ans;
    }
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}