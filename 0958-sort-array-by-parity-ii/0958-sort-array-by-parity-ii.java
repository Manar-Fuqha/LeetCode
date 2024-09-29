class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int j=0,i=1;
         
      while(i<nums.length&&j<nums.length){
            if(nums[i]%2==0 ){
                if(nums[j]%2==1){

                
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j=j+2;  
                i=i+2;}
            
            else{
                j=j+2;
            }
        }
        else{i+=2;}
        }
        return nums;
    }
}