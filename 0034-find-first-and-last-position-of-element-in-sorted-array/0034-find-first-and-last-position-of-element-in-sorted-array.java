class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};

        result[0]=findPosition(nums , target ,true);
        if(result[0]==-1)return result;
        result[1]=findPosition(nums,target,false);
        return result;
        
       
    }

    private int findPosition(int[] nums , int target , boolean findStart){
         int l=0 , r = nums.length-1 , p=-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(nums[mid]==target){
                p=mid;
                if(findStart){
                    r=mid-1;
                }
                else l=mid+1;
                
            }
            else if (nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return p;
    }
}