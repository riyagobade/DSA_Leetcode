class Solution {
    public boolean isThree(int n) {
      int count =0;
      int m=1;
      while(m<=n){
        if(n%m==0){
            count++;
        }
        m++;
      } 
      return count==3;
    }
}