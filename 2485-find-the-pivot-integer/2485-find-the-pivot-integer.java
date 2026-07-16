class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2;
        int leftsum = 0;
        for(int x=1; x<=n; x++){
            leftsum += x;
            int rightsum= sum - leftsum + x;
            if(leftsum == rightsum){
                return x;
            }
        }
        return -1;
    }
}