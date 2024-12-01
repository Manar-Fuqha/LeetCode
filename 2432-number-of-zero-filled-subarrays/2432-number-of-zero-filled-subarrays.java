class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0 , size=0;
        for(int i=0;i<nums.length ;i++){
            if(nums[i]==0){
                size++;
            }
            else{
           
                count += countZeros(size);
                size=0;
            }
            if(i==nums.length-1){
                count += countZeros(size);
                
            }
        }
        return count;
    }
    private long countZeros(long n ){
        return n*(n+1)/2;
    }
}