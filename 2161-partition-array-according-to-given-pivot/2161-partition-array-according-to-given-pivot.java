class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int countSmall = 0;
       int countEqual = 0;
       for(int i=0; i<nums.length; i++){
        if(nums[i]<pivot){
            countSmall++;
        } else if(nums[i] == pivot){
            countEqual++;
        }
       }
       int left = 0;
       int right = countSmall+countEqual;
       int mid = countSmall;
       int[] result = new int[nums.length];
       for(int i=0; i<nums.length; i++){
        if(nums[i]<pivot){
            result[left]=nums[i];
            left++;
        } else if(nums[i]>pivot){
            result[right]=nums[i];
            right++;
        } else if(nums[i]==pivot){
            result[mid] = nums[i];
            mid++;
        }
       }
       return result;
    }
}