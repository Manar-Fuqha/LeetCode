class Solution {
    public int getWinner(int[] arr, int k) {
      
       int max = arr[0];
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                count++;
            } else {
                max = arr[i];
                count = 1;
            }
            if (count == k) {
                return max;
            }
        }
        return max;
    }
}