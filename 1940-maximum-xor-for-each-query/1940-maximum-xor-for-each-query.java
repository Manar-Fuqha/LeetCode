class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xOr =0;
        int [] arr = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            xOr^=nums[i];
            arr[arr.length-i-1] = xOr ^ ((1 << maximumBit) - 1); 
        }
        return arr;
    }
   
}