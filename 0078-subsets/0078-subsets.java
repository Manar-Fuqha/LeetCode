class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();      
        allSets(list , nums , new ArrayList<>() , 0); 
        return list;
    }
    public void allSets(List<List<Integer>> list , int[] nums , List<Integer> l , int index){
        
       
             list.add(new ArrayList<>(l));
        
        for(int i=index;i<nums.length;i++){
            if(!l.contains(nums[i])){
            l.add(nums[i]);
            allSets(list , nums ,l , i+1);
            l.remove(l.size()-1);
            }
        }
    }
}