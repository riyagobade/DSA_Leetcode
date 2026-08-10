class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
        if(nums[i] == original){
            original*=2;
        } 
        i++;
        }
        return original;
    }
}