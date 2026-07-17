class Solution {
    public String largestGoodInteger(String num) {
        char max = 0;
        for (int i = 0; i <= num.length() - 3; i++) {
            if (num.charAt(i) == num.charAt(i + 1) &&
                num.charAt(i) == num.charAt(i + 2)) {
                if (num.charAt(i) > max) {
                    max = num.charAt(i);
                }
            }
        }
        if (max == 0) {
            return "";
        }
        return "" + max + max + max;
    }
}