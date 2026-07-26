class Solution {
    public int jump(int[] nums) {
        int jumps = 0, l=0, r=0;
        while(r < nums.length-1){
            int far = 0;
            for(int i =l; i<=r; i++){
                far = Math.max(nums[i]+i , far);
            }
             jumps= jumps+1;
                l = r+1;
                r= far;
        }
    return jumps;
    }
}