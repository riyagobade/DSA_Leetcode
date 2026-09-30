class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        int s = n+m;
        while(i < n && j<m){
            if(nums1[i] < nums2[j]){
                ans.add(nums1[i++]);
            } else{
                ans.add(nums2[j++]);
            }
        }
        while(i<n){
            ans.add(nums1[i++]);
        }
        while(j<m){
            ans.add(nums2[j++]);
        }
        if(ans.size() %2 == 1){
            return(double) ans.get(s / 2);
        }
        return (double) (ans.get(s / 2) + ans.get(s / 2 - 1)) / 2.0;
    }
}