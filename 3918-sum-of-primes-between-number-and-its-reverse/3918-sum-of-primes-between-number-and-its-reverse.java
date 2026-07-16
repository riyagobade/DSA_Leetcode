class Solution {
    public int sumOfPrimesInRange(int n) {
        int r =0;
        int a = n;
        while(a != 0){
            r = r*10 + a%10;
            a=a/10;
        }
        int start = Math.min(n,r);
        int end = Math.max(n,r);
        int sum =0;
        for(int i=start; i <= end; i++){
            if(prime(i)){
                sum+=i;
            }
        }
    return sum;
    }
    public boolean prime(int n){
        if(n < 2){
            return false;
        }
        for(int i =2; i*i<= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}