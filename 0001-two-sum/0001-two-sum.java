class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first = 0 , last = 1;
        
        while((nums[first]+nums[last]) !=target){
            if(last == nums.length-1)
            {
                first++;
                last=first+1;
            }              
            else{
                last++;
            }
        }
         return new int[]{first, last};
    }
}