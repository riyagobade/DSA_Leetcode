class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) {
            String s = String.valueOf(num);
            if (s.length() % 2 != 0) {
                continue;
            }
            int n = s.length() / 2;
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum1 += s.charAt(i) - '0';
            }
            for (int i = n; i < s.length(); i++) {
                sum2 += s.charAt(i) - '0';
            }
            if (sum1 == sum2) {
                count++;
            }
        }
        return count;
    }
}