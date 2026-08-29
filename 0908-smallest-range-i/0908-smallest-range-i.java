import java.util.*;

class Solution {
    public int smallestRangeI(int[] nums, int k) {
       int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int score = max - min - 2 * k;
        return Math.max(0, score);
    }
}