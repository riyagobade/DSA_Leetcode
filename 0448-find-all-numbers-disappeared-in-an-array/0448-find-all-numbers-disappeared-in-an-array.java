class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        boolean[] present = new boolean[n + 1];
        for(int i =0; i<nums.length; i++){
            present[nums[i]] = true;
        }
        for(int i = 1; i<=nums.length; i++){
            if(!present[i]){
                list.add(i);
            }
        }
        return list;
    }
}