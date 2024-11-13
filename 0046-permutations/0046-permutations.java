class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums , new ArrayList<>() , result);
        return result;
    }
    private void backtracking(int[] nums , List<Integer> arr , List<List<Integer>> result){

        if(arr.size()==nums.length){
            result.add(new ArrayList<>(arr));
            return;
        }

        for(int i=0;i<nums.length;i++){
              if (arr.contains(nums[i])) continue;
            arr.add(nums[i]);
            backtracking(nums,arr,result);
            arr.remove(arr.size()-1);
        }
    }
}