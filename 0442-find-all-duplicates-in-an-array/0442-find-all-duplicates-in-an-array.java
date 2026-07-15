class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int freq[] = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =1; i<= nums.length; i++){
            if(freq[i] == 2){
                ans.add(i);
            }
        }
        return ans;
    }
}