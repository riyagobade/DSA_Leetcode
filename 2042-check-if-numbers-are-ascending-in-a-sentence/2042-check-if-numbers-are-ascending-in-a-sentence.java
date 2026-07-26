class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int prev = -1;
        for (String str : arr) {
            if (Character.isDigit(str.charAt(0))) {
                int curr = Integer.parseInt(str);
                if (curr <= prev) {
                    return false;
                }
                prev = curr;
            }
        }
        return true;
    }
}