class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    private int reverse(int num){
        int x=0;
        while(num!=0){
            x=x*10+num%10;
            num/=10;
        }
        return x;
    }
}