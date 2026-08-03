class Solution {
    public long removeZeros(long n) {
        long rev=0;
        while(n > 0){
            long digit = n%10;
            if(digit != 0){
                rev=rev*10+digit;
            }
            n/=10;
        }
        long ans = 0;
        while(rev > 0){
            long digit = rev%10;
            ans=ans*10+digit;
            rev/=10;
        }
        return ans;
    }
}