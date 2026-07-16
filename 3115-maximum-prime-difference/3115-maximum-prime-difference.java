class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int index[] = new int[nums.length];
        int pointer =0;
        for(int i=0; i<nums.length; i++){
            if(prime(nums[i])){
                index[pointer] = i;
                pointer++;
            }
        }
        int ans = index[pointer-1] - index[0];
        return ans;
    }
    public boolean prime(int n){
        if(n < 2){
            return false;
        }
        for(int i=2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}