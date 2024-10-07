class Solution {
    public void rotate(int[] nums, int k) {

        int length = nums.length;
        k=k%length;
     
        rotate(nums,0,length-1);
        rotate(nums,0 ,k-1);
        rotate(nums,k ,length-1);
    }

    public void rotate(int[]nums,int first , int last){
        while(first<last){
            int tmp =nums[first];
            nums[first]=nums[last];
            nums[last]=tmp;
            first++;
            last--;
        }


    }
}