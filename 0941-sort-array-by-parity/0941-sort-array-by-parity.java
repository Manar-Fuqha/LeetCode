class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1)return nums;
        int j=nums.length-1;
        int i=0;
        while(i<=j){
             if(nums[j]%2==0){
                 if(nums[i]%2==1){
                      int temp=nums[j];
             nums[j]=nums[i];
             nums[i]=temp;
                     i++;
                     j--;
                 }
            else{
                i++;
            }
                
            }
          else{
              j--;
          }
                
            
        }
        return nums;
    }
}