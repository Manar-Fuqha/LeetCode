class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           hash.put(nums[i] , hash.getOrDefault(nums[i], 0) + 1);
    }
   
   for(int x :nums){
    if(hash.get(x)==1 &&!hash.containsKey(x-1) && !hash.containsKey(x+1)){
        l.add(x);
    }
   }
   return l;
   
}
}