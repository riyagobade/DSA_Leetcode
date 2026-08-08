class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length+1];
        for(int num:nums){
            freq[num]++;
        }
        int ans =0;
        for(int i=1; i<=nums.length; i++){
            if(freq[i] >= 2){
                ans = i;
            }
        }
        return ans;
    }
}