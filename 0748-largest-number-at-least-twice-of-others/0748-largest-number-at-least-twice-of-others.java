class Solution {
    public int dominantIndex(int[] nums) {
     int max=0 , index=0;
        int max_1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;}
            
        }
          for(int i=0;i<nums.length;i++){
         
            if(nums[i]>max_1 &&nums[i]<max) max_1=nums[i];
        }
      

        if(max_1*2<=max)return index;
        return -1;
        
    }
}