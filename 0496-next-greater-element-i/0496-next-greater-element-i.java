class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int max = -1;
        int[] nums =new int[nums2.length];
        for(int i= 0 ; i<nums2.length;i++){
            for(int j=i+1 ; j < nums2.length ; j++){
                if(nums2[j]> nums2[i]){
                    max = nums2[j];
                    break;
                }

            }
            nums[i]=max;
            max=-1;
           
        }

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    nums1[i]=nums[j];
                    break;
                }
            }
        }
        return nums1;
    }
}