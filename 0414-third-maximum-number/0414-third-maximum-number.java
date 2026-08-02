class Solution {
    public int thirdMax(int[] nums) {
        Long one = null;
        Long two = null;
        Long three = null;
        for (int num : nums) {
            if ((one != null && num == one) ||
                (two != null && num == two) ||
                (three != null && num == three)) {
                continue;
            }
            if (one == null || num > one) {
                three = two;
                two = one;
                one = (long) num;
            } 
            else if (two == null || num > two) {
                three = two;
                two = (long) num;
            } 
            else if (three == null || num > three) {
                three = (long) num;
            }
        }
        return (three == null) ? one.intValue() : three.intValue();
    }
}