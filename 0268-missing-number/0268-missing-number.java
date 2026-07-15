class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long sum = (long)n*(n+1)/2;
        int a = 0;
        for(int i=0; i< nums.length; i++){
            a+=nums[i];
        }
        return (int)sum - a;
    }
}