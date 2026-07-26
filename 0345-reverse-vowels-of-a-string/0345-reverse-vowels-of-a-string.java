class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        String vowel = "aeiouAEIOU";
        while(left < right){
            while(left < right){
                char ch = arr[left];
                if(vowel.indexOf(ch) != -1)
                 break;
                left++;
            }
            while(left < right){
                char ch = arr[right];
                if(vowel.indexOf(ch) != -1)
                 break;
                right--;
            }
            if(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}