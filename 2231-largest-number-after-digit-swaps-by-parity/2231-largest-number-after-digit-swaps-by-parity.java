class Solution {
    public int largestInteger(int num) {
       char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] - '0') % 2 == (arr[i] - '0') % 2) {
                    if (arr[j] > arr[maxIndex]) {
                        maxIndex = j;
                    }
                }
            }
            char temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return Integer.parseInt(new String(arr));
    }
}