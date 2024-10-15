class Solution {
    public int singleNonDuplicate(int[] nums) {
        int f=0 , l=nums.length-1;
        while(f<l){
            int mid = f+(l-f)/2;  
            if(nums[mid]==nums[mid+1]){
                mid--;
            }   
            int leftPart = (mid-f)+1;    
            if((leftPart)%2==1){
                l=mid;
            }
            else {
                f=mid+1;  
            }

        }
        return nums[f];
    }
}