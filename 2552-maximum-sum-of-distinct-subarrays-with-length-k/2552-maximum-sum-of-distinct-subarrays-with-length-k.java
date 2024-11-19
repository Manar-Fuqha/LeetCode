class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        
        long sum =0 , maxSum =0;

        int i=0 ;
        Set<Integer> set = new HashSet<>();
       for (int j=0;j<nums.length;j++){

        while(set.contains(nums[j])){
            set.remove(nums[i]);
            sum -= nums[i];
            i++;
        }
        set.add(nums[j]);
        sum += nums[j];
        if(j-i+1==k){
            maxSum=Math.max(maxSum,sum);
       
        set.remove(nums[i]);
        sum-=nums[i];
        i++;
       }
       }
       return maxSum;
}

}