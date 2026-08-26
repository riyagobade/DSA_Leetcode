class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int count = 1;
        int i = 0;
        while (candies > 0) {
            int give = Math.min(count, candies);
            ans[i] += give;
            candies -= give;
            count++;
            i = (i + 1) % num_people;
        }
        return ans;
    }
}