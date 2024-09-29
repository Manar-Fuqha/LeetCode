class Solution {
    public int thirdMax(int[] nums) {
     Integer max=null,
     max2=null,
     max3=null;

     for(Integer num : nums){
        if(num.equals(max) || num.equals(max2)||num.equals(max3)) continue;

        if(max==null || num>max){
            max3=max2;
            max2=max;
            max=num;

        }
        else if(max2==null || num>max2){
            max3=max2;
            max2=num;

        }
        else if(max3==null || num>max3){
            max3=num;

        }
     }
     if(max3==null)return max;
     return max3;
}
}