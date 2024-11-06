class Solution {
    public boolean canSortArray(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){

            
            if(nums[j] > nums[j+1] && countOfSetBits(nums[j]) == countOfSetBits(nums[j+1])){
              
                    swap(nums , j , j+1);
                }
              
            }
        }
        

        for(int i=0;i<nums.length-1;i++){
            System.out.println(nums[i] + " , " + nums[i+1]);
            if(nums[i] > nums[i+1]) return false;
        }
        return true;

    }
    private void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
   }
    private int countOfSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1); 
            count++;
        }
        return count;
    }
}