class Solution {
    public boolean checkString(String s) {
        int i =0;
        int j=1;
        while(i<s.length()-1 && j< s.length()){
        if(s.charAt(i) == 'b' && s.charAt(j) == 'a'){
            return false;
        }
        j++;
        i++;
        }
        return true;
    }
}