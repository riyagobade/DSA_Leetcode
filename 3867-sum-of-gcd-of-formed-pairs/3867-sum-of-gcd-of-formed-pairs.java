class Solution {
    public long gcdSum(int[] nums) {
        int mx = nums[0];
        int prefixGcd[] = new int[nums.length];
       for(int i=0; i<nums.length; i++){
         mx = Math.max(mx,nums[i]);
        prefixGcd[i] = gcd(nums[i],mx);
       } 
       Arrays.sort(prefixGcd);
       long ans = 0;
       int left=0;
       int right=nums.length-1;
       while(left<right){
        ans += (long)gcd(prefixGcd[left],prefixGcd[right]);
        left++;
        right--;
       } 
       return ans;
    }
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return Math.abs(a);
       }
}